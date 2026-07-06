// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListVpcInfoByAgentStorageRequest extends TeaModel {
    /**
     * <p>The agent storage name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-test</p>
     */
    @NameInMap("AgentStorageName")
    public String agentStorageName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The number of VPCs per page for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListVpcInfoByAgentStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcInfoByAgentStorageRequest self = new ListVpcInfoByAgentStorageRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcInfoByAgentStorageRequest setAgentStorageName(String agentStorageName) {
        this.agentStorageName = agentStorageName;
        return this;
    }
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    public ListVpcInfoByAgentStorageRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListVpcInfoByAgentStorageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
