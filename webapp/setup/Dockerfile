FROM centos:latest

# Create temporary storage for binaries
RUN mkdir -p /var/temp \
	mkdir -p /opt/bueffle

# Download OpenJDK from source
RUN curl -o /var/temp/zulu11.33.15.rpm https://cdn.azul.com/zulu/bin/zulu11.33.15-ca-jdk11.0.4-linux.x86_64.rpm

# Install binaries
RUN yum install -y /var/temp/zulu11.33.15.rpm

# Clean space
RUN rm -rf /var/temp/* \
	yum clean all \
	rm -rf /var/cache/yum

USER 1001

WORKDIR /opt/bueffle

CMD bash
