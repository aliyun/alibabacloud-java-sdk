// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateJenkinsImageRegistryNameRequest extends TeaModel {
    /**
     * <p>The image repository ID.</p>
     * <blockquote>
     * <p>You can call the <a href="~~PageImageRegistry~~">PageImageRegistry</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>25090</p>
     */
    @NameInMap("RegistryId")
    public Long registryId;

    /**
     * <p>The image repository name.</p>
     * 
     * <strong>example:</strong>
     * <p>a0603tk1</p>
     */
    @NameInMap("RegistryName")
    public String registryName;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>121.33.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static UpdateJenkinsImageRegistryNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJenkinsImageRegistryNameRequest self = new UpdateJenkinsImageRegistryNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJenkinsImageRegistryNameRequest setRegistryId(Long registryId) {
        this.registryId = registryId;
        return this;
    }
    public Long getRegistryId() {
        return this.registryId;
    }

    public UpdateJenkinsImageRegistryNameRequest setRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }
    public String getRegistryName() {
        return this.registryName;
    }

    public UpdateJenkinsImageRegistryNameRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
