// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ServiceExposure extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PodId")
    public String podId;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    public static ServiceExposure build(java.util.Map<String, ?> map) throws Exception {
        ServiceExposure self = new ServiceExposure();
        return TeaModel.build(map, self);
    }

    public ServiceExposure setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ServiceExposure setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ServiceExposure setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ServiceExposure setPodId(String podId) {
        this.podId = podId;
        return this;
    }
    public String getPodId() {
        return this.podId;
    }

    public ServiceExposure setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ServiceExposure setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ServiceExposure setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ServiceExposure setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
