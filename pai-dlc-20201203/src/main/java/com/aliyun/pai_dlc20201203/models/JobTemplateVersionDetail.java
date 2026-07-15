// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobTemplateVersionDetail extends TeaModel {
    @NameInMap("Constraints")
    public java.util.Map<String, String> constraints;

    /**
     * <p>Configuration content of the job template. It supports all parameter fields of the CreateJob API and is stored as a JSON object.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>User ID that created this version</p>
     */
    @NameInMap("CreatedBy")
    public String createdBy;

    /**
     * <p>Creation time of this version</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <p>Template version number</p>
     */
    @NameInMap("Version")
    public Integer version;

    public static JobTemplateVersionDetail build(java.util.Map<String, ?> map) throws Exception {
        JobTemplateVersionDetail self = new JobTemplateVersionDetail();
        return TeaModel.build(map, self);
    }

    public JobTemplateVersionDetail setConstraints(java.util.Map<String, String> constraints) {
        this.constraints = constraints;
        return this;
    }
    public java.util.Map<String, String> getConstraints() {
        return this.constraints;
    }

    public JobTemplateVersionDetail setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public JobTemplateVersionDetail setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public JobTemplateVersionDetail setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public JobTemplateVersionDetail setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
