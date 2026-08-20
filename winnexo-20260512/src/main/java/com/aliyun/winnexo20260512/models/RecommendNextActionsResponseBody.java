// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RecommendNextActionsResponseBody extends TeaModel {
    /**
     * <p>The business status code. 200 indicates success. A failure returns a backend error code (ERR.* / InvalidParameter.*).</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The next-step recommendations.</p>
     */
    @NameInMap("nextActions")
    public java.util.List<RecommendNextActionsResponseBodyNextActions> nextActions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The meeting reservation title.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample session title</p>
     */
    @NameInMap("title")
    public String title;

    public static RecommendNextActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecommendNextActionsResponseBody self = new RecommendNextActionsResponseBody();
        return TeaModel.build(map, self);
    }

    public RecommendNextActionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecommendNextActionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecommendNextActionsResponseBody setNextActions(java.util.List<RecommendNextActionsResponseBodyNextActions> nextActions) {
        this.nextActions = nextActions;
        return this;
    }
    public java.util.List<RecommendNextActionsResponseBodyNextActions> getNextActions() {
        return this.nextActions;
    }

    public RecommendNextActionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecommendNextActionsResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class RecommendNextActionsResponseBodyNextActions extends TeaModel {
        /**
         * <p>The recommendation title.</p>
         * 
         * <strong>example:</strong>
         * <p>Continue analyzing this metric</p>
         */
        @NameInMap("actionTitle")
        public String actionTitle;

        /**
         * <p>The skill code.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSkillCode</p>
         */
        @NameInMap("skillCode")
        public String skillCode;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample skill</p>
         */
        @NameInMap("skillName")
        public String skillName;

        /**
         * <p>The recommendation type.</p>
         * 
         * <strong>example:</strong>
         * <p>recommend_reply</p>
         */
        @NameInMap("type")
        public String type;

        public static RecommendNextActionsResponseBodyNextActions build(java.util.Map<String, ?> map) throws Exception {
            RecommendNextActionsResponseBodyNextActions self = new RecommendNextActionsResponseBodyNextActions();
            return TeaModel.build(map, self);
        }

        public RecommendNextActionsResponseBodyNextActions setActionTitle(String actionTitle) {
            this.actionTitle = actionTitle;
            return this;
        }
        public String getActionTitle() {
            return this.actionTitle;
        }

        public RecommendNextActionsResponseBodyNextActions setSkillCode(String skillCode) {
            this.skillCode = skillCode;
            return this;
        }
        public String getSkillCode() {
            return this.skillCode;
        }

        public RecommendNextActionsResponseBodyNextActions setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public RecommendNextActionsResponseBodyNextActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
