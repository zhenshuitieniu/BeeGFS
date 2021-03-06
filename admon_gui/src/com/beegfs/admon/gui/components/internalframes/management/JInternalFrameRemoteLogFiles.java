package com.beegfs.admon.gui.components.internalframes.management;

import com.beegfs.admon.gui.common.enums.NodeTypesEnum;
import com.beegfs.admon.gui.common.nodes.NodeEnvironment;
import com.beegfs.admon.gui.common.tools.GuiTk;
import com.beegfs.admon.gui.common.tools.HttpTk;
import com.beegfs.admon.gui.components.internalframes.JInternalFrameInterface;
import com.beegfs.admon.gui.components.managers.FrameManager;
import com.beegfs.admon.gui.program.Main;
import java.util.logging.Logger;


public class JInternalFrameRemoteLogFiles extends javax.swing.JInternalFrame
   implements JInternalFrameInterface
{
   static final Logger LOGGER = Logger.getLogger(
      JInternalFrameRemoteLogFiles.class.getCanonicalName());
   private static final long serialVersionUID = 1L;
   private static final String GET_LOGFILE_BASE_URL = HttpTk.generateAdmonUrl("/XML_GetLogFile");

   private transient final NodeEnvironment nodes;

   public JInternalFrameRemoteLogFiles(NodeEnvironment nodes)
   {
      this.nodes = nodes;

      initComponents();
      setTitle(getFrameTitle());
      setFrameIcon(GuiTk.getFrameIcon());
   }

   @Override
   public boolean isEqual(JInternalFrameInterface obj)
   {
      return obj instanceof JInternalFrameRemoteLogFiles;
   }

   @Override
   public final String getFrameTitle()
   {
	   return Main.getLocal().getString("Log Files");
   }

   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT
    * modify this code. The content of this method is always regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jScrollPaneFrame = new javax.swing.JScrollPane();
      jPanelFrame = new javax.swing.JPanel();
      jTabbedPaneChooser = new javax.swing.JTabbedPane();
      remoteLogFileTabPanelMgmtd = new com.beegfs.admon.gui.components.panels.RemoteLogFileTabPanel(
         nodes.getNodes(NodeTypesEnum.MANAGMENT),
         GET_LOGFILE_BASE_URL);
      remoteLogFileTabPanelMeta = new com.beegfs.admon.gui.components.panels.RemoteLogFileTabPanel(
         nodes.getNodes(NodeTypesEnum.METADATA),
         GET_LOGFILE_BASE_URL);
      remoteLogFileTabPanelStorage = new com.beegfs.admon.gui.components.panels.RemoteLogFileTabPanel(
         nodes.getNodes(NodeTypesEnum.STORAGE),
         GET_LOGFILE_BASE_URL);
      remoteLogFileTabPanelAdmon = new com.beegfs.admon.gui.components.panels.RemoteLogFileTabPanel(
         nodes.getNodes(NodeTypesEnum.ADMON),
         GET_LOGFILE_BASE_URL);
      remoteLogFileTabPanelClient = new com.beegfs.admon.gui.components.panels.RemoteLogFileTabPanel(
         nodes.getNodes(NodeTypesEnum.CLIENT),
         GET_LOGFILE_BASE_URL);

      setClosable(true);
      setIconifiable(true);
      setMaximizable(true);
      setResizable(true);
      addInternalFrameListener(new javax.swing.event.InternalFrameListener()
      {
         public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt)
         {
         }
         public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt)
         {
         }
         public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt)
         {
            formInternalFrameClosed(evt);
         }
         public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt)
         {
         }
         public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt)
         {
         }
         public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt)
         {
         }
         public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt)
         {
         }
      });

      jPanelFrame.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
      jPanelFrame.setPreferredSize(new java.awt.Dimension(867, 348));
      jPanelFrame.setLayout(new java.awt.BorderLayout(5, 5));

      jTabbedPaneChooser.addTab(Main.getLocal().getString("Management Daemon"), remoteLogFileTabPanelMgmtd);
      jTabbedPaneChooser.addTab(Main.getLocal().getString("Metadata Daemon"), remoteLogFileTabPanelMeta);
      jTabbedPaneChooser.addTab(Main.getLocal().getString("Storage Daemon"), remoteLogFileTabPanelStorage);
      jTabbedPaneChooser.addTab(Main.getLocal().getString("Admon Daemon"), remoteLogFileTabPanelAdmon);
      jTabbedPaneChooser.addTab(Main.getLocal().getString("Client"), remoteLogFileTabPanelClient);

      jPanelFrame.add(jTabbedPaneChooser, java.awt.BorderLayout.CENTER);
      jTabbedPaneChooser.getAccessibleContext().setAccessibleName("");

      jScrollPaneFrame.setViewportView(jPanelFrame);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jScrollPaneFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jScrollPaneFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
      FrameManager.delFrame(this);
    }//GEN-LAST:event_formInternalFrameClosed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JPanel jPanelFrame;
   private javax.swing.JScrollPane jScrollPaneFrame;
   private javax.swing.JTabbedPane jTabbedPaneChooser;
   private com.beegfs.admon.gui.components.panels.RemoteLogFileTabPanel remoteLogFileTabPanelAdmon;
   private com.beegfs.admon.gui.components.panels.RemoteLogFileTabPanel remoteLogFileTabPanelClient;
   private com.beegfs.admon.gui.components.panels.RemoteLogFileTabPanel remoteLogFileTabPanelMeta;
   private com.beegfs.admon.gui.components.panels.RemoteLogFileTabPanel remoteLogFileTabPanelMgmtd;
   private com.beegfs.admon.gui.components.panels.RemoteLogFileTabPanel remoteLogFileTabPanelStorage;
   // End of variables declaration//GEN-END:variables
}
