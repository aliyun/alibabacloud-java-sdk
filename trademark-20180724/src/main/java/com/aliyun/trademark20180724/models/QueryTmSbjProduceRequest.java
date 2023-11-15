// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTmSbjProduceRequest extends TeaModel {
    @NameInMap("HighPriorityBizTypeStr")
    public String highPriorityBizTypeStr;

    @NameInMap("HighPriorityMaterialNameStr")
    public String highPriorityMaterialNameStr;

    @NameInMap("HighPriorityOrderIdStr")
    public String highPriorityOrderIdStr;

    @NameInMap("HighPriorityUserIdStr")
    public String highPriorityUserIdStr;

    @NameInMap("PrincipalKey")
    public String principalKey;

    @NameInMap("PrincipalName")
    public String principalName;

    @NameInMap("ProducerType")
    public String producerType;

    @NameInMap("QueryOrderPageSize")
    public Long queryOrderPageSize;

    public static QueryTmSbjProduceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTmSbjProduceRequest self = new QueryTmSbjProduceRequest();
        return TeaModel.build(map, self);
    }

    public QueryTmSbjProduceRequest setHighPriorityBizTypeStr(String highPriorityBizTypeStr) {
        this.highPriorityBizTypeStr = highPriorityBizTypeStr;
        return this;
    }
    public String getHighPriorityBizTypeStr() {
        return this.highPriorityBizTypeStr;
    }

    public QueryTmSbjProduceRequest setHighPriorityMaterialNameStr(String highPriorityMaterialNameStr) {
        this.highPriorityMaterialNameStr = highPriorityMaterialNameStr;
        return this;
    }
    public String getHighPriorityMaterialNameStr() {
        return this.highPriorityMaterialNameStr;
    }

    public QueryTmSbjProduceRequest setHighPriorityOrderIdStr(String highPriorityOrderIdStr) {
        this.highPriorityOrderIdStr = highPriorityOrderIdStr;
        return this;
    }
    public String getHighPriorityOrderIdStr() {
        return this.highPriorityOrderIdStr;
    }

    public QueryTmSbjProduceRequest setHighPriorityUserIdStr(String highPriorityUserIdStr) {
        this.highPriorityUserIdStr = highPriorityUserIdStr;
        return this;
    }
    public String getHighPriorityUserIdStr() {
        return this.highPriorityUserIdStr;
    }

    public QueryTmSbjProduceRequest setPrincipalKey(String principalKey) {
        this.principalKey = principalKey;
        return this;
    }
    public String getPrincipalKey() {
        return this.principalKey;
    }

    public QueryTmSbjProduceRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public QueryTmSbjProduceRequest setProducerType(String producerType) {
        this.producerType = producerType;
        return this;
    }
    public String getProducerType() {
        return this.producerType;
    }

    public QueryTmSbjProduceRequest setQueryOrderPageSize(Long queryOrderPageSize) {
        this.queryOrderPageSize = queryOrderPageSize;
        return this;
    }
    public Long getQueryOrderPageSize() {
        return this.queryOrderPageSize;
    }

}
