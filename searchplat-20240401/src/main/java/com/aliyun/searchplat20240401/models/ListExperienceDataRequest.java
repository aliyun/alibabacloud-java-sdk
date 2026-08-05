// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListExperienceDataRequest extends TeaModel {
    /**
     * <p>The data type.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <ul>
     * <li>true</li>
     * <li>false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>The service type.</p>
     * 
     * <strong>example:</strong>
     * <p>document-analyze</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    public static ListExperienceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperienceDataRequest self = new ListExperienceDataRequest();
        return TeaModel.build(map, self);
    }

    public ListExperienceDataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public ListExperienceDataRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListExperienceDataRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
