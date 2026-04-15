// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListLlmAccessProfilesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12f407b22cbe4890ac595f09985848d5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListLlmAccessProfilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLlmAccessProfilesRequest self = new ListLlmAccessProfilesRequest();
        return TeaModel.build(map, self);
    }

    public ListLlmAccessProfilesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListLlmAccessProfilesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLlmAccessProfilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
