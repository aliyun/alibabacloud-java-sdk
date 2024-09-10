// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateBaselineCheckWhiteRecordResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public UpdateBaselineCheckWhiteRecordResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBaselineCheckWhiteRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaselineCheckWhiteRecordResponseBody self = new UpdateBaselineCheckWhiteRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBaselineCheckWhiteRecordResponseBody setData(UpdateBaselineCheckWhiteRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateBaselineCheckWhiteRecordResponseBodyData getData() {
        return this.data;
    }

    public UpdateBaselineCheckWhiteRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateBaselineCheckWhiteRecordResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>92</p>
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
         * <p>en</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The reason why the check item is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The ID of the whitelist record.</p>
         * 
         * <strong>example:</strong>
         * <p>1582</p>
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
         * <p>HOST_BASELINE_WHITE_LIST_23</p>
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

        public static UpdateBaselineCheckWhiteRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateBaselineCheckWhiteRecordResponseBodyData self = new UpdateBaselineCheckWhiteRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateBaselineCheckWhiteRecordResponseBodyData setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public UpdateBaselineCheckWhiteRecordResponseBodyData setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public UpdateBaselineCheckWhiteRecordResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public UpdateBaselineCheckWhiteRecordResponseBodyData setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public UpdateBaselineCheckWhiteRecordResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateBaselineCheckWhiteRecordResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public UpdateBaselineCheckWhiteRecordResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
