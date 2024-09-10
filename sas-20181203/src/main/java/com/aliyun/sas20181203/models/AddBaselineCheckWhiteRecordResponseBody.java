// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddBaselineCheckWhiteRecordResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public AddBaselineCheckWhiteRecordResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddBaselineCheckWhiteRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBaselineCheckWhiteRecordResponseBody self = new AddBaselineCheckWhiteRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBaselineCheckWhiteRecordResponseBody setData(AddBaselineCheckWhiteRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddBaselineCheckWhiteRecordResponseBodyData getData() {
        return this.data;
    }

    public AddBaselineCheckWhiteRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddBaselineCheckWhiteRecordResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCheckItemWarningSummary~~">ListCheckItemWarningSummary</a> operation to query the IDs of check items.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>76</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The reason why the check item is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>AutoTest</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The ID of the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>864153</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <p>The data source. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: server</li>
         * <li><strong>agentless</strong>: agentless detection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agentless</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The object that is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>HOST_BASELINE_WHITE_LIST_21</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The type of the assets on which the whitelist rule takes effect. Valid values:</p>
         * <ul>
         * <li><strong>all_instance</strong>: all servers</li>
         * <li><strong>instance</strong>: specific servers</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static AddBaselineCheckWhiteRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddBaselineCheckWhiteRecordResponseBodyData self = new AddBaselineCheckWhiteRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddBaselineCheckWhiteRecordResponseBodyData setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public AddBaselineCheckWhiteRecordResponseBodyData setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public AddBaselineCheckWhiteRecordResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public AddBaselineCheckWhiteRecordResponseBodyData setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public AddBaselineCheckWhiteRecordResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public AddBaselineCheckWhiteRecordResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public AddBaselineCheckWhiteRecordResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
