// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class TestRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public TestRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static TestRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestRuleResponseBody self = new TestRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public TestRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TestRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestRuleResponseBody setData(TestRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TestRuleResponseBodyData getData() {
        return this.data;
    }

    public TestRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TestRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase extends TeaModel {
        @NameInMap("Words")
        public String words;

        @NameInMap("Begin")
        public Long begin;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("EmotionValue")
        public Integer emotionValue;

        @NameInMap("End")
        public Long end;

        @NameInMap("Role")
        public String role;

        public static TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase build(java.util.Map<String, ?> map) throws Exception {
            TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase self = new TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase();
            return TeaModel.build(map, self);
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setWords(String words) {
            this.words = words;
            return this;
        }
        public String getWords() {
            return this.words;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setEmotionValue(Integer emotionValue) {
            this.emotionValue = emotionValue;
            return this;
        }
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord extends TeaModel {
        @NameInMap("From")
        public Integer from;

        @NameInMap("Val")
        public String val;

        @NameInMap("Tid")
        public String tid;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("To")
        public Integer to;

        public static TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord build(java.util.Map<String, ?> map) throws Exception {
            TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord self = new TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord();
            return TeaModel.build(map, self);
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setVal(String val) {
            this.val = val;
            return this;
        }
        public String getVal() {
            return this.val;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setTid(String tid) {
            this.tid = tid;
            return this;
        }
        public String getTid() {
            return this.tid;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

    }

    public static class TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords extends TeaModel {
        @NameInMap("KeyWord")
        public java.util.List<TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord> keyWord;

        public static TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords build(java.util.Map<String, ?> map) throws Exception {
            TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords self = new TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords();
            return TeaModel.build(map, self);
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords setKeyWord(java.util.List<TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord> keyWord) {
            this.keyWord = keyWord;
            return this;
        }
        public java.util.List<TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWordsKeyWord> getKeyWord() {
            return this.keyWord;
        }

    }

    public static class TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid extends TeaModel {
        @NameInMap("cid")
        public java.util.List<String> cid;

        public static TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid build(java.util.Map<String, ?> map) throws Exception {
            TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid self = new TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid();
            return TeaModel.build(map, self);
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid setCid(java.util.List<String> cid) {
            this.cid = cid;
            return this;
        }
        public java.util.List<String> getCid() {
            return this.cid;
        }

    }

    public static class TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo extends TeaModel {
        @NameInMap("Phrase")
        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase phrase;

        @NameInMap("KeyWords")
        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords keyWords;

        @NameInMap("Cid")
        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid cid;

        public static TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo build(java.util.Map<String, ?> map) throws Exception {
            TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo self = new TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo();
            return TeaModel.build(map, self);
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setPhrase(TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase phrase) {
            this.phrase = phrase;
            return this;
        }
        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoPhrase getPhrase() {
            return this.phrase;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setKeyWords(TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoKeyWords getKeyWords() {
            return this.keyWords;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo setCid(TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid cid) {
            this.cid = cid;
            return this;
        }
        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfoCid getCid() {
            return this.cid;
        }

    }

    public static class TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList extends TeaModel {
        @NameInMap("ConditionHitInfo")
        public java.util.List<TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo> conditionHitInfo;

        public static TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList build(java.util.Map<String, ?> map) throws Exception {
            TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList self = new TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList();
            return TeaModel.build(map, self);
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList setConditionHitInfo(java.util.List<TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo> conditionHitInfo) {
            this.conditionHitInfo = conditionHitInfo;
            return this;
        }
        public java.util.List<TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoListConditionHitInfo> getConditionHitInfo() {
            return this.conditionHitInfo;
        }

    }

    public static class TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo extends TeaModel {
        @NameInMap("ConditionHitInfoList")
        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList conditionHitInfoList;

        @NameInMap("Rid")
        public Long rid;

        public static TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo build(java.util.Map<String, ?> map) throws Exception {
            TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo self = new TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo();
            return TeaModel.build(map, self);
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setConditionHitInfoList(TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList conditionHitInfoList) {
            this.conditionHitInfoList = conditionHitInfoList;
            return this;
        }
        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfoConditionHitInfoList getConditionHitInfoList() {
            return this.conditionHitInfoList;
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

    }

    public static class TestRuleResponseBodyDataHitRuleReviewInfoList extends TeaModel {
        @NameInMap("HitRuleReviewInfo")
        public java.util.List<TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo> hitRuleReviewInfo;

        public static TestRuleResponseBodyDataHitRuleReviewInfoList build(java.util.Map<String, ?> map) throws Exception {
            TestRuleResponseBodyDataHitRuleReviewInfoList self = new TestRuleResponseBodyDataHitRuleReviewInfoList();
            return TeaModel.build(map, self);
        }

        public TestRuleResponseBodyDataHitRuleReviewInfoList setHitRuleReviewInfo(java.util.List<TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo> hitRuleReviewInfo) {
            this.hitRuleReviewInfo = hitRuleReviewInfo;
            return this;
        }
        public java.util.List<TestRuleResponseBodyDataHitRuleReviewInfoListHitRuleReviewInfo> getHitRuleReviewInfo() {
            return this.hitRuleReviewInfo;
        }

    }

    public static class TestRuleResponseBodyData extends TeaModel {
        @NameInMap("HitRuleReviewInfoList")
        public TestRuleResponseBodyDataHitRuleReviewInfoList hitRuleReviewInfoList;

        @NameInMap("Poc")
        public Boolean poc;

        public static TestRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestRuleResponseBodyData self = new TestRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestRuleResponseBodyData setHitRuleReviewInfoList(TestRuleResponseBodyDataHitRuleReviewInfoList hitRuleReviewInfoList) {
            this.hitRuleReviewInfoList = hitRuleReviewInfoList;
            return this;
        }
        public TestRuleResponseBodyDataHitRuleReviewInfoList getHitRuleReviewInfoList() {
            return this.hitRuleReviewInfoList;
        }

        public TestRuleResponseBodyData setPoc(Boolean poc) {
            this.poc = poc;
            return this;
        }
        public Boolean getPoc() {
            return this.poc;
        }

    }

}
