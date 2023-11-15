// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryOrderLogisticsListRequest extends TeaModel {
    @NameInMap("FileType")
    public String fileType;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProduceOrderId")
    public String produceOrderId;

    @NameInMap("RegisterNumber")
    public String registerNumber;

    public static QueryOrderLogisticsListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderLogisticsListRequest self = new QueryOrderLogisticsListRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderLogisticsListRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public QueryOrderLogisticsListRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryOrderLogisticsListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOrderLogisticsListRequest setProduceOrderId(String produceOrderId) {
        this.produceOrderId = produceOrderId;
        return this;
    }
    public String getProduceOrderId() {
        return this.produceOrderId;
    }

    public QueryOrderLogisticsListRequest setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }
    public String getRegisterNumber() {
        return this.registerNumber;
    }

}
