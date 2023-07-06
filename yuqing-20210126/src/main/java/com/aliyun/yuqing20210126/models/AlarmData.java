// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class AlarmData extends TeaModel {
    @NameInMap("alarmLevel")
    public String alarmLevel;

    @NameInMap("alarmMsgId")
    public Long alarmMsgId;

    @NameInMap("alarmRuleId")
    public Long alarmRuleId;

    @NameInMap("alarmRuleName")
    public String alarmRuleName;

    @NameInMap("alarmTimestamp")
    public Long alarmTimestamp;

    @NameInMap("authorName")
    public String authorName;

    @NameInMap("content")
    public String content;

    @NameInMap("docIdStr")
    public String docIdStr;

    @NameInMap("docMediaType")
    public String docMediaType;

    @NameInMap("gmtModifiedTimestamp")
    public Long gmtModifiedTimestamp;

    @NameInMap("mediaName")
    public String mediaName;

    @NameInMap("memos")
    public java.util.List<String> memos;

    @NameInMap("message")
    public YuqingMessage message;

    @NameInMap("modifierName")
    public String modifierName;

    @NameInMap("modifierOutNo")
    public String modifierOutNo;

    @NameInMap("projectId")
    public Long projectId;

    @NameInMap("projectName")
    public String projectName;

    @NameInMap("selfContentSignStr")
    public String selfContentSignStr;

    @NameInMap("sourceUrl")
    public String sourceUrl;

    @NameInMap("state")
    public String state;

    @NameInMap("tags")
    public java.util.List<String> tags;

    @NameInMap("title")
    public String title;

    @NameInMap("type")
    public String type;

    public static AlarmData build(java.util.Map<String, ?> map) throws Exception {
        AlarmData self = new AlarmData();
        return TeaModel.build(map, self);
    }

    public AlarmData setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public String getAlarmLevel() {
        return this.alarmLevel;
    }

    public AlarmData setAlarmMsgId(Long alarmMsgId) {
        this.alarmMsgId = alarmMsgId;
        return this;
    }
    public Long getAlarmMsgId() {
        return this.alarmMsgId;
    }

    public AlarmData setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public AlarmData setAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
        return this;
    }
    public String getAlarmRuleName() {
        return this.alarmRuleName;
    }

    public AlarmData setAlarmTimestamp(Long alarmTimestamp) {
        this.alarmTimestamp = alarmTimestamp;
        return this;
    }
    public Long getAlarmTimestamp() {
        return this.alarmTimestamp;
    }

    public AlarmData setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public AlarmData setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AlarmData setDocIdStr(String docIdStr) {
        this.docIdStr = docIdStr;
        return this;
    }
    public String getDocIdStr() {
        return this.docIdStr;
    }

    public AlarmData setDocMediaType(String docMediaType) {
        this.docMediaType = docMediaType;
        return this;
    }
    public String getDocMediaType() {
        return this.docMediaType;
    }

    public AlarmData setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
        this.gmtModifiedTimestamp = gmtModifiedTimestamp;
        return this;
    }
    public Long getGmtModifiedTimestamp() {
        return this.gmtModifiedTimestamp;
    }

    public AlarmData setMediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public String getMediaName() {
        return this.mediaName;
    }

    public AlarmData setMemos(java.util.List<String> memos) {
        this.memos = memos;
        return this;
    }
    public java.util.List<String> getMemos() {
        return this.memos;
    }

    public AlarmData setMessage(YuqingMessage message) {
        this.message = message;
        return this;
    }
    public YuqingMessage getMessage() {
        return this.message;
    }

    public AlarmData setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public AlarmData setModifierOutNo(String modifierOutNo) {
        this.modifierOutNo = modifierOutNo;
        return this;
    }
    public String getModifierOutNo() {
        return this.modifierOutNo;
    }

    public AlarmData setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public AlarmData setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public AlarmData setSelfContentSignStr(String selfContentSignStr) {
        this.selfContentSignStr = selfContentSignStr;
        return this;
    }
    public String getSelfContentSignStr() {
        return this.selfContentSignStr;
    }

    public AlarmData setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public AlarmData setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public AlarmData setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public AlarmData setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AlarmData setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
