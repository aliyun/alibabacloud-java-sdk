// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryOrderLogisticsListRequest extends TeaModel {
    // 起始页
    @NameInMap("PageNum")
    public Long pageNum;

    // 分页大小
    @NameInMap("PageSize")
    public Long pageSize;

    // 订单号
    @NameInMap("ProduceOrderId")
    public String produceOrderId;

    // 注册号
    @NameInMap("RegisterNumber")
    public String registerNumber;

    public static QueryOrderLogisticsListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderLogisticsListRequest self = new QueryOrderLogisticsListRequest();
        return TeaModel.build(map, self);
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
