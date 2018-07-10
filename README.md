# TestNG Restlet Blog

Test integrating a Restlet application with Tomcat.

## Running the application

This app requires Docker for providing the best experience possible. (I stole this line from those sites asking about cookies!)

```bash
make
```

This will package the app and start the Tomcat server, as well as tail the logs of the server (so we can figure out when it's fully started).
`Ctrl+C` will quit tailing the logs (but keep the server running in daemon mode).

Test the application by accessing `http://<your-ip>/blog/articles`, replace `<your-ip>` with
`localhost`/`127.0.0.1`, or your `docker-machine ip <docker-machine-name>`, depending on your system and setup.

## Repackaging the application

```bash
make repackage
```

This will repackage the app and restart the Tomcat server.
