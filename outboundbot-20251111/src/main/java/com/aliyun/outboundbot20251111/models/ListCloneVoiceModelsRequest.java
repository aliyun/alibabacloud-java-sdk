// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListCloneVoiceModelsRequest extends TeaModel {
    /**
     * <p>页码，从1开始</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>每页记录数</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListCloneVoiceModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloneVoiceModelsRequest self = new ListCloneVoiceModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListCloneVoiceModelsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloneVoiceModelsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
