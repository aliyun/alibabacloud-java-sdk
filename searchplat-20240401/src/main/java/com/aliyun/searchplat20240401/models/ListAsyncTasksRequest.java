// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListAsyncTasksRequest extends TeaModel {
    /**
     * <p>The trial data ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1231</p>
     */
    @NameInMap("dataId")
    public Integer dataId;

    /**
     * <p>Specifies whether to validate the request parameters without performing the actual operation. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>The service type.</p>
     * <ul>
     * <li>document-analyze.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>document-analyze</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    public static ListAsyncTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTasksRequest self = new ListAsyncTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListAsyncTasksRequest setDataId(Integer dataId) {
        this.dataId = dataId;
        return this;
    }
    public Integer getDataId() {
        return this.dataId;
    }

    public ListAsyncTasksRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListAsyncTasksRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
