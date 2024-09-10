// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateJenkinsImageRegistryPersistenceDayRequest extends TeaModel {
    /**
     * <p>The retention period. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PersistenceDay")
    public Integer persistenceDay;

    /**
     * <p>The ID of the image repository.</p>
     * <blockquote>
     * <p>You can call the <a href="~~PageImageRegistry~~">PageImageRegistry</a> operation to query the IDs of image repositories.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>25363</p>
     */
    @NameInMap("RegistryId")
    public Long registryId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>106.11.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static UpdateJenkinsImageRegistryPersistenceDayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJenkinsImageRegistryPersistenceDayRequest self = new UpdateJenkinsImageRegistryPersistenceDayRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJenkinsImageRegistryPersistenceDayRequest setPersistenceDay(Integer persistenceDay) {
        this.persistenceDay = persistenceDay;
        return this;
    }
    public Integer getPersistenceDay() {
        return this.persistenceDay;
    }

    public UpdateJenkinsImageRegistryPersistenceDayRequest setRegistryId(Long registryId) {
        this.registryId = registryId;
        return this;
    }
    public Long getRegistryId() {
        return this.registryId;
    }

    public UpdateJenkinsImageRegistryPersistenceDayRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
