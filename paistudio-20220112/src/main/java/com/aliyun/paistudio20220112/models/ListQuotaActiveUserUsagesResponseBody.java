// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListQuotaActiveUserUsagesResponseBody extends TeaModel {
    @NameInMap("QuotaUserUsage")
    public java.util.List<QuotaUser> quotaUserUsage;

    @NameInMap("QuotaUserUsages")
    public java.util.List<QuotaUser> quotaUserUsages;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E7C42CC7-2E85-508A-84F4-923B605FD10F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListQuotaActiveUserUsagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaActiveUserUsagesResponseBody self = new ListQuotaActiveUserUsagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotaActiveUserUsagesResponseBody setQuotaUserUsage(java.util.List<QuotaUser> quotaUserUsage) {
        this.quotaUserUsage = quotaUserUsage;
        return this;
    }
    public java.util.List<QuotaUser> getQuotaUserUsage() {
        return this.quotaUserUsage;
    }

    public ListQuotaActiveUserUsagesResponseBody setQuotaUserUsages(java.util.List<QuotaUser> quotaUserUsages) {
        this.quotaUserUsages = quotaUserUsages;
        return this;
    }
    public java.util.List<QuotaUser> getQuotaUserUsages() {
        return this.quotaUserUsages;
    }

    public ListQuotaActiveUserUsagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuotaActiveUserUsagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
