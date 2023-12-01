/*
	Trabajo práctico trasversal de la Guía 5 del curso Desarrollo de Apps
	Universidad de La Punta en el marco del proyecto Argentina Programa 4.0

	Integrantes:
		John David Molina Velarde
		Leticia Mores
		Enrique Germán Martínez
		Carlos Eduardo Beltrán

	Esta es la pantalla principal del sistema de gestión administrativo de
	alumnos de la ULP. Permite invocar al CRUD de Alumnos, de Materias y de
	Inscripciones, además de permitir invocar al CRUD de usuarios admnistrativos.
 */
package vistas;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author John David Molina Velarde, Leticia Mores, Enrique Germán Martínez, Carlos Eduardo Beltrán
 */
public class PantallaPpal extends javax.swing.JFrame {

	/**
	 * Constructor
	 */
	public PantallaPpal() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuGestionAlumnos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuGestionMaterias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuGestionInscripcionesporAlumno = new javax.swing.JMenuItem();
        menuGestionInscripcionesporMateria = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuGestionUsuarios = new javax.swing.JMenuItem();
        menuAcercaDe = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        menuSalirSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de gestión ULP");
        setIconImage(getIconImage());
        setResizable(false);

        escritorio.setPreferredSize(new java.awt.Dimension(900, 610));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ULP Foto campus universiatrio con borde y logo- 1200x597.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1220, 523));

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1238, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumnos");

        menuGestionAlumnos.setText("Gestión de alumnos");
        menuGestionAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(menuGestionAlumnos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materias");

        menuGestionMaterias.setText("Gestión de materias");
        menuGestionMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(menuGestionMaterias);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inscripciones");

        menuGestionInscripcionesporAlumno.setText("Gestión de inscripciones por Alumnos");
        menuGestionInscripcionesporAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionInscripcionesporAlumnoActionPerformed(evt);
            }
        });
        jMenu3.add(menuGestionInscripcionesporAlumno);

        menuGestionInscripcionesporMateria.setText("Gestión de inscripciones por Materias");
        menuGestionInscripcionesporMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionInscripcionesporMateriaActionPerformed(evt);
            }
        });
        jMenu3.add(menuGestionInscripcionesporMateria);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Configuración");

        menuGestionUsuarios.setText("Gestión de Usuarios");
        menuGestionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionUsuariosActionPerformed(evt);
            }
        });
        jMenu4.add(menuGestionUsuarios);

        menuAcercaDe.setText("Acerca de los autores");
        menuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaDeActionPerformed(evt);
            }
        });
        jMenu4.add(menuAcercaDe);

        jMenuBar1.add(jMenu4);

        menuSalir.setText("Salir");

        menuSalirSistema.setText("Salir del sistema");
        menuSalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirSistemaActionPerformed(evt);
            }
        });
        menuSalir.add(menuSalirSistema);

        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	
	/**
	 * Carga una imagen de la ULP en el fondo del escritorio.
	 */
	private void mostrarFondo(){
		escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1238, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
	} // mostrarFondo
	
	
	
	/**
	 * Cdo el usuario elige el menú de Gestión de Alumos, invoca al CRUD Alumnos.
	 * @param evt 
	 */
    private void menuGestionAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionAlumnosActionPerformed
        escritorio.removeAll(); // cierro todas las ventanas del escritorio
		mostrarFondo(); // recargo la foto de la ULP
		escritorio.repaint();
		
		CrudAlumnos ga = new CrudAlumnos(); // creo un internal Frame
		ga.setVisible(true); // lo pongo visible
		
		escritorio.add(ga); // lo pongo en el escritorio
		escritorio.moveToFront(ga); //pongo la ventana al frente:
    }//GEN-LAST:event_menuGestionAlumnosActionPerformed

	
	
	/**
	 * Cuando el usuario elige el menú de Salir. Cierra la ventana
	 * @param evt 
	 */
    private void menuSalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirSistemaActionPerformed
        dispose();//cierra la ventana
		//System.exit(0);// termina el programa
    }//GEN-LAST:event_menuSalirSistemaActionPerformed

	
	
	/**
	 * Cuando el usuario elige el menú Gestión Materias. Invoca al CRUD de materias.
	 * @param evt 
	 */
    private void menuGestionMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionMateriasActionPerformed
        escritorio.removeAll(); // cierro todas las ventanas del escritorio
		mostrarFondo(); //recargo la foto de la ULP
		escritorio.repaint();
		
		CrudMaterias gm = new CrudMaterias(); // creo un internal Frame
		gm.setVisible(true); // lo pongo visible
		
		escritorio.add(gm); // lo pongo en el escritorio
		escritorio.moveToFront(gm); //pongo la ventana al frente:
    }//GEN-LAST:event_menuGestionMateriasActionPerformed

	
	
	/**
	 * Cuando el usuario elige el menú de gestión de Inscripciones por Alumno
	 * Invoca al Crud de Inscripciones organizado por alumnos
	 * @param evt 
	 */
    private void menuGestionInscripcionesporAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionInscripcionesporAlumnoActionPerformed
        escritorio.removeAll(); // cierro todas las ventanas del escritorio
		mostrarFondo(); // recargo la foto de fondo de la ULP
		escritorio.repaint();
		
		CrudInscripcionesXAlumno gi = new CrudInscripcionesXAlumno(); // creo un internal Frame
		gi.setVisible(true); // lo pongo visible
		
		escritorio.add(gi); // lo pongo en el escritorio
		escritorio.moveToFront(gi); //pongo la ventana al frente:
    }//GEN-LAST:event_menuGestionInscripcionesporAlumnoActionPerformed

	
	
	/**
	 * Cuando el usuario elige el menú de gestión de Inscripciones por Materia
	 * Invoca al Crud de Inscripciones organizado por materias
	 * @param evt 
	 */
    private void menuGestionInscripcionesporMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionInscripcionesporMateriaActionPerformed
        escritorio.removeAll(); // cierro todas las ventanas del escritorio
		mostrarFondo(); //recarga el fondo con la foto de la ULP
		escritorio.repaint();
		
		CrudInscripcionesXMateria gi = new CrudInscripcionesXMateria(); // creo un internal Frame
		gi.setVisible(true); // lo pongo visible
		
		escritorio.add(gi); // lo pongo en el escritorio
		escritorio.moveToFront(gi); //pongo la ventana al frente:
    }//GEN-LAST:event_menuGestionInscripcionesporMateriaActionPerformed

	
	
	
	/**
	 * Cuando el usuario elige el menú de Acerca de los Autores
	 * Muestra información de los creadores del sistema
	 * @param evt 
	 */
    private void menuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaDeActionPerformed
        escritorio.removeAll(); // cierro todas las ventanas del escritorio
	mostrarFondo(); //recarga el fondo con la foto de la ULP
	escritorio.repaint();
		
	AcercaDe ac = new AcercaDe(); // creo un internal Frame
	ac.setVisible(true); // lo pongo visible
		
	escritorio.add(ac); // lo pongo en el escritorio
	escritorio.moveToFront(ac); //pongo la ventana al frente:
    }//GEN-LAST:event_menuAcercaDeActionPerformed

	
	
	/**
	 * Cuando el usuario elige el menú Gestión de Usuarios
	 * Invoca al CRUD de usuarios autorizados a ingresar a la parte administrativa
	 * del sistema (los alumnos solo pueden ver la pantalla de autogestión)
	 * @param evt 
	 */
    private void menuGestionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionUsuariosActionPerformed
        escritorio.removeAll(); // cierro todas las ventanas del escritorio
		mostrarFondo(); //recarga el fondo con la foto de la ULP
		escritorio.repaint();
		
		CrudUsuarios gu = new CrudUsuarios(); // creo un internal Frame
		gu.setVisible(true); // lo pongo visible
		
		escritorio.add(gu); // lo pongo en el escritorio
		escritorio.moveToFront(gu); //pongo la ventana al frente:
    }//GEN-LAST:event_menuGestionUsuariosActionPerformed

	
	/**
	 * Permite cambiar el icono de la ventana y de la barra de tareas para que
	 * sea el ícono de la ULP
	 * @return 
	 */
	@Override
	public Image getIconImage() { // defino el icono del jFrame
		Image retValue = Toolkit.getDefaultToolkit().
				getImage(ClassLoader.getSystemResource("imagenes/ulp_32x32.png")); //icono de la ULP
		return retValue;
	} //getIconImage
	
	
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(PantallaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PantallaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PantallaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PantallaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PantallaPpal().setVisible(true);
			}
		});
	} // main
	
	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAcercaDe;
    private javax.swing.JMenuItem menuGestionAlumnos;
    private javax.swing.JMenuItem menuGestionInscripcionesporAlumno;
    private javax.swing.JMenuItem menuGestionInscripcionesporMateria;
    private javax.swing.JMenuItem menuGestionMaterias;
    private javax.swing.JMenuItem menuGestionUsuarios;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenuItem menuSalirSistema;
    // End of variables declaration//GEN-END:variables
}