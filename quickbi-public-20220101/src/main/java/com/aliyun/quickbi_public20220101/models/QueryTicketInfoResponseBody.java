// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryTicketInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the generated ticket.</p>
     */
    @NameInMap("Result")
    public QueryTicketInfoResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryTicketInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketInfoResponseBody self = new QueryTicketInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTicketInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTicketInfoResponseBody setResult(QueryTicketInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryTicketInfoResponseBodyResult getResult() {
        return this.result;
    }

    public QueryTicketInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTicketInfoResponseBodyResult extends TeaModel {
        /**
         * <p>Notes.</p>
         * 
         * <strong>example:</strong>
         * <p>a27a9aec-<strong><strong>-</strong></strong>-bd40-1a21ea41d7c5</p>
         */
        @NameInMap("AccessTicket")
        public String accessTicket;

        /**
         * <p>The ID of the component in the report.</p>
         * 
         * <strong>example:</strong>
         * <p>sfdgsds-<strong><strong>-</strong></strong>-a608-mghdgd</p>
         */
        @NameInMap("CmptId")
        public String cmptId;

        /**
         * <p>Global parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[&amp;{quot;paramKey\&quot;:\&quot;price\&quot;,\&quot;joinType\&quot;and\&quot;,\&quot;conditionList\&quot;:[{\&quot; operation\&quot;\&quot;\&quot;\&quot;\&quot;\&quot;\&quot;value ;&amp; quot;\&quot;\&quot;\&quot;\&quot;\&quot;\&quot;\&quot;\&quot;\&amp;quot product_type\&quot;,\&quot;joinType\&quot;:\&quot;and &quot;;,&amp; quot;conditionList\&quot;, the conditions must be:[{\&quot;operate&quot; ;:&amp; quot;in\&quot;,\&quot;value\&quot;, the conditions must be:[\&quot; office supplies\&quot;,\&quot; furniture products\&quot;]}]}]\n</p>
         */
        @NameInMap("GlobalParam")
        public String globalParam;

        /**
         * <p>Expiration time of the note.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-30 03:03:49</p>
         */
        @NameInMap("InvalidTime")
        public String invalidTime;

        /**
         * <p>The maximum number of supported bills.</p>
         * 
         * <strong>example:</strong>
         * <p>9999</p>
         */
        @NameInMap("MaxTicketNum")
        public Integer maxTicketNum;

        /**
         * <p>The ID of the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>2fe4fbd8-<strong><strong>-</strong></strong>-b3e1-e92c7af083ea</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>The registration time of the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-09 22:23:49</p>
         */
        @NameInMap("RegisterTime")
        public String registerTime;

        /**
         * <p>The number of bills that have been consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        @NameInMap("UsedTicketNum")
        public Integer usedTicketNum;

        /**
         * <p>The user ID of the Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>974e50**********9033f46</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Set the watermarking parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>Tripartite embedding of Ticket</p>
         */
        @NameInMap("WatermarkParam")
        public String watermarkParam;

        /**
         * <p>The ID of the operations report.</p>
         * 
         * <strong>example:</strong>
         * <p>ccd3428c-<strong><strong>-</strong></strong>-a608-26bae29dffee</p>
         */
        @NameInMap("WorksId")
        public String worksId;

        public static QueryTicketInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryTicketInfoResponseBodyResult self = new QueryTicketInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryTicketInfoResponseBodyResult setAccessTicket(String accessTicket) {
            this.accessTicket = accessTicket;
            return this;
        }
        public String getAccessTicket() {
            return this.accessTicket;
        }

        public QueryTicketInfoResponseBodyResult setCmptId(String cmptId) {
            this.cmptId = cmptId;
            return this;
        }
        public String getCmptId() {
            return this.cmptId;
        }

        public QueryTicketInfoResponseBodyResult setGlobalParam(String globalParam) {
            this.globalParam = globalParam;
            return this;
        }
        public String getGlobalParam() {
            return this.globalParam;
        }

        public QueryTicketInfoResponseBodyResult setInvalidTime(String invalidTime) {
            this.invalidTime = invalidTime;
            return this;
        }
        public String getInvalidTime() {
            return this.invalidTime;
        }

        public QueryTicketInfoResponseBodyResult setMaxTicketNum(Integer maxTicketNum) {
            this.maxTicketNum = maxTicketNum;
            return this;
        }
        public Integer getMaxTicketNum() {
            return this.maxTicketNum;
        }

        public QueryTicketInfoResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public QueryTicketInfoResponseBodyResult setRegisterTime(String registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public String getRegisterTime() {
            return this.registerTime;
        }

        public QueryTicketInfoResponseBodyResult setUsedTicketNum(Integer usedTicketNum) {
            this.usedTicketNum = usedTicketNum;
            return this;
        }
        public Integer getUsedTicketNum() {
            return this.usedTicketNum;
        }

        public QueryTicketInfoResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryTicketInfoResponseBodyResult setWatermarkParam(String watermarkParam) {
            this.watermarkParam = watermarkParam;
            return this;
        }
        public String getWatermarkParam() {
            return this.watermarkParam;
        }

        public QueryTicketInfoResponseBodyResult setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

    }

}
