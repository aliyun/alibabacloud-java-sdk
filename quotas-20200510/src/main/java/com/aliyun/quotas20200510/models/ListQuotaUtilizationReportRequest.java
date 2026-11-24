// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaUtilizationReportRequest extends TeaModel {
    /**
     * <p>Specifies whether to filter quotas by adjustability. Valid values:</p>
     * <ul>
     * <li>true: Queries only adjustable quotas.</li>
     * <li>false: Queries only non-adjustable quotas.
     * If this parameter is not specified, quotas are not filtered by adjustability.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Adjustable")
    public Boolean adjustable;

    /**
     * <p>The search keyword. Performs a fuzzy match based on the quota name or quota ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("KeyWords")
    public String keyWords;

    /**
     * <p>The maximum number of entries to return for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Do not specify this parameter for the first query. For subsequent queries, pass the NextToken value returned in the previous response as is, and keep the quota type and filter conditions unchanged. Do not parse or construct the token.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjEwLCJvdHNOZXh0VG9rZW4iOiJDQUVTR3dvWkNoY0tFM1J2ZEdGc1gzVnpZV2RsWDNCbGNtTmxiblFRQVJnQkl1RUJDZ2tCQUFBQUFBQUFXVUFLMHdFRHpnQUFBREZUTXpFek9ETXdNemN6TnpNNE16VXpPVE0xTXpjek5qTXpNekV6TlRNNE16Z3VVek01TXpjek5UTTJOalkyTWpZeE16Y3laRFl5TmpJek16WXhNbVF6TkRNMk16RXpOREprTmpFek9UTTRNemN5WkRZMk16WTJORE16TXpVMk16TXhNemt6TURZMk16RXpNUzVUTmpFMk16YzBOamsyWmpabE56UTNNall4TmprMll5NVRNelkyTWpZMU16a3pPRE0yTmpRek1qSmtNekV6TlRNeU5qRXlaRE0wTXpFek1UWTJNbVEyTWpZME16TXpNVEprTXpNMk16WXlOalV6TkRNMU16VXpNalkwTXpVek1qTTMiLCJ0YXNrSWQiOiI5NzU2ZmJhNy1iYjNhLTQ2MTQtYTk4Ny1mNmQzNWMxOTBmMTEiLCJ1aWQiOiIxODA3Nzg1OTU3NjMxNTg4IiwidXRpbGl6YXRpb25TdGF0dXNlcyI6IiJ9</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The abbreviation of the cloud service.</p>
     * <blockquote>
     * <p>For information about how to obtain the abbreviation of a cloud service, see ProductCode in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>CommonQuota, FlowControl</p>
     * 
     * <strong>example:</strong>
     * <p>CommonQuota</p>
     */
    @NameInMap("QuotaCategory")
    public String quotaCategory;

    /**
     * <p>The region ID of the quota, such as cn-hangzhou. If this parameter is not specified or is left empty, quotas are not filtered by region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("QuotaRegionId")
    public String quotaRegionId;

    /**
     * <p>The utilization statuses. You can specify multiple values. If this parameter is not specified or an empty list is passed, quotas are not filtered by utilization status.</p>
     */
    @NameInMap("UtilizationStatuses")
    public java.util.List<String> utilizationStatuses;

    public static ListQuotaUtilizationReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaUtilizationReportRequest self = new ListQuotaUtilizationReportRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotaUtilizationReportRequest setAdjustable(Boolean adjustable) {
        this.adjustable = adjustable;
        return this;
    }
    public Boolean getAdjustable() {
        return this.adjustable;
    }

    public ListQuotaUtilizationReportRequest setKeyWords(String keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public String getKeyWords() {
        return this.keyWords;
    }

    public ListQuotaUtilizationReportRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaUtilizationReportRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaUtilizationReportRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListQuotaUtilizationReportRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public ListQuotaUtilizationReportRequest setQuotaRegionId(String quotaRegionId) {
        this.quotaRegionId = quotaRegionId;
        return this;
    }
    public String getQuotaRegionId() {
        return this.quotaRegionId;
    }

    public ListQuotaUtilizationReportRequest setUtilizationStatuses(java.util.List<String> utilizationStatuses) {
        this.utilizationStatuses = utilizationStatuses;
        return this;
    }
    public java.util.List<String> getUtilizationStatuses() {
        return this.utilizationStatuses;
    }

}
