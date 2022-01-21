// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListEnterpriseCodeResponseBody extends TeaModel {
    @NameInMap("EnterpriseCodes")
    public java.util.List<ListEnterpriseCodeResponseBodyEnterpriseCodes> enterpriseCodes;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEnterpriseCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseCodeResponseBody self = new ListEnterpriseCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseCodeResponseBody setEnterpriseCodes(java.util.List<ListEnterpriseCodeResponseBodyEnterpriseCodes> enterpriseCodes) {
        this.enterpriseCodes = enterpriseCodes;
        return this;
    }
    public java.util.List<ListEnterpriseCodeResponseBodyEnterpriseCodes> getEnterpriseCodes() {
        return this.enterpriseCodes;
    }

    public ListEnterpriseCodeResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEnterpriseCodeResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEnterpriseCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnterpriseCodeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEnterpriseCodeResponseBodyEnterpriseCodes extends TeaModel {
        @NameInMap("EnterpriseCode")
        public String enterpriseCode;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        public static ListEnterpriseCodeResponseBodyEnterpriseCodes build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseCodeResponseBodyEnterpriseCodes self = new ListEnterpriseCodeResponseBodyEnterpriseCodes();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseCodeResponseBodyEnterpriseCodes setEnterpriseCode(String enterpriseCode) {
            this.enterpriseCode = enterpriseCode;
            return this;
        }
        public String getEnterpriseCode() {
            return this.enterpriseCode;
        }

        public ListEnterpriseCodeResponseBodyEnterpriseCodes setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

}
