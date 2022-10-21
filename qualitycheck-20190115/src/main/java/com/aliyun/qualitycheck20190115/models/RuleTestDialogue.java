// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RuleTestDialogue extends TeaModel {
    @NameInMap("Content")
    public java.util.List<RuleTestDialogueContent> content;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

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
        @NameInMap("Begin")
        public Long begin;

        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("EmotionValue")
        public Integer emotionValue;

        @NameInMap("End")
        public Long end;

        @NameInMap("HourMinSec")
        public String hourMinSec;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Role")
        public String role;

        @NameInMap("SilenceDuration")
        public Long silenceDuration;

        @NameInMap("SpeechRate")
        public Long speechRate;

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
