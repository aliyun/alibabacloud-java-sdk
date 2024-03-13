// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class QueryFaceVideoTemplateRequest extends TeaModel {
    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TemplateId")
    public String templateId;

    public static QueryFaceVideoTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceVideoTemplateRequest self = new QueryFaceVideoTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceVideoTemplateRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryFaceVideoTemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryFaceVideoTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
