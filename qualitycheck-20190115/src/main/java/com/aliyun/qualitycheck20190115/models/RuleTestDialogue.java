// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RuleTestDialogue extends TeaModel {
    /**
     * <p>Content</p>
     */
    @NameInMap("Content")
    public java.util.List<RuleTestDialogueContent> content;

    /**
     * <p>Conversation ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Conversation Name</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>group</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("UserGroup")
    public String userGroup;

    public static RuleTestDialogue build(java.util.Map<String, ?> map) throws Exception {
        RuleTestDialogue self = new RuleTestDialogue();
        return TeaModel.build(map, self);
    }

    public RuleTestDialogue setContent(java.util.List<RuleTestDialogueContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<RuleTestDialogueContent> getContent() {
        return this.content;
    }

    public RuleTestDialogue setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RuleTestDialogue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RuleTestDialogue setUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }
    public String getUserGroup() {
        return this.userGroup;
    }

    public static class RuleTestDialogueContent extends TeaModel {
        /**
         * <p>Start Time in long</p>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        @NameInMap("Begin")
        public Long begin;

        /**
         * <p>Start Time in long</p>
         * 
         * <strong>example:</strong>
         * <p>350</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>Emotion energy value</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EmotionValue")
        public Integer emotionValue;

        /**
         * <p>End time in long</p>
         * 
         * <strong>example:</strong>
         * <p>1360</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>Hour, minute, second</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("HourMinSec")
        public String hourMinSec;

        /**
         * <p>Identity</p>
         * 
         * <strong>example:</strong>
         * <p>客户</p>
         */
        @NameInMap("Identity")
        public String identity;

        /**
         * <p>Role</p>
         * 
         * <strong>example:</strong>
         * <p>客户</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>Silence duration</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SilenceDuration")
        public Long silenceDuration;

        /**
         * <p>Speech rate</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SpeechRate")
        public Long speechRate;

        /**
         * <p>Dialogue</p>
         * 
         * <strong>example:</strong>
         * <p>方便</p>
         */
        @NameInMap("Words")
        public String words;

        public static RuleTestDialogueContent build(java.util.Map<String, ?> map) throws Exception {
            RuleTestDialogueContent self = new RuleTestDialogueContent();
            return TeaModel.build(map, self);
        }

        public RuleTestDialogueContent setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public RuleTestDialogueContent setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public RuleTestDialogueContent setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public RuleTestDialogueContent setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public RuleTestDialogueContent setHourMinSec(String hourMinSec) {
            this.hourMinSec = hourMinSec;
            return this;
        }
        public String getHourMinSec() {
            return this.hourMinSec;
        }

        public RuleTestDialogueContent setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public RuleTestDialogueContent setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public RuleTestDialogueContent setSilenceDuration(Long silenceDuration) {
            this.silenceDuration = silenceDuration;
            return this;
        }
        public Long getSilenceDuration() {
            return this.silenceDuration;
        }

        public RuleTestDialogueContent setSpeechRate(Long speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Long getSpeechRate() {
            return this.speechRate;
        }

        public RuleTestDialogueContent setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

    }

}
