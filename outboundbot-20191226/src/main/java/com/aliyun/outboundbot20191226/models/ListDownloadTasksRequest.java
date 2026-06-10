// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListDownloadTasksRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ae4572af-376f-439f-8970-38764acbaa91</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page number</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Count</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDownloadTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDownloadTasksRequest self = new ListDownloadTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListDownloadTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDownloadTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDownloadTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
