// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListEnterpriseCodeResponseBody extends TeaModel {
    /**
     * <p>The information about enterprise codes.</p>
     */
    @NameInMap("EnterpriseCodes")
    public java.util.List<ListEnterpriseCodeResponseBodyEnterpriseCodes> enterpriseCodes;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for returning the next page when the data is returned in more than one page.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1A57EF84-D587-4CF9-B0C8-307488BF52C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The enterprise code.</p>
         * 
         * <strong>example:</strong>
         * <p>12P**</p>
         */
        @NameInMap("EnterpriseCode")
        public String enterpriseCode;

        /**
         * <p>Indicates whether the enterprise code is the default one.</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
