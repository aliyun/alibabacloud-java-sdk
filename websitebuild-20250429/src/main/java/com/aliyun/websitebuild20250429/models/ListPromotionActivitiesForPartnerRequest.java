// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListPromotionActivitiesForPartnerRequest extends TeaModel {
    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>WECHAT</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The employee code.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("EmployeeCode")
    public String employeeCode;

    /**
     * <p>The number of entries per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. This parameter is empty if no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListPromotionActivitiesForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPromotionActivitiesForPartnerRequest self = new ListPromotionActivitiesForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public ListPromotionActivitiesForPartnerRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ListPromotionActivitiesForPartnerRequest setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
        return this;
    }
    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public ListPromotionActivitiesForPartnerRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPromotionActivitiesForPartnerRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
