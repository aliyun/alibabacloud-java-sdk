// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAnnotationMissionSummaryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAnnotationMissionSummaryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>You are not authorized to perform this action. CDR:View privileges are required.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAnnotationMissionSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAnnotationMissionSummaryResponseBody self = new GetAnnotationMissionSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAnnotationMissionSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAnnotationMissionSummaryResponseBody setData(GetAnnotationMissionSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAnnotationMissionSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetAnnotationMissionSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAnnotationMissionSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAnnotationMissionSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAnnotationMissionSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AddCustomizationDataCount")
        public Integer addCustomizationDataCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AddVocabularyDataCount")
        public Integer addVocabularyDataCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnnotationInvalid")
        public Integer annotationInvalid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CharacterCorrectRate")
        public Integer characterCorrectRate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CharacterErrorRate")
        public Integer characterErrorRate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChatTotalCount")
        public Integer chatTotalCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NoAnnotation")
        public Integer noAnnotation;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SentenceErrorRate")
        public Integer sentenceErrorRate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WordErrorRate")
        public Integer wordErrorRate;

        public static GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo self = new GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo();
            return TeaModel.build(map, self);
        }

        public GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo setAddCustomizationDataCount(Integer addCustomizationDataCount) {
            this.addCustomizationDataCount = addCustomizationDataCount;
            return this;
        }
        public Integer getAddCustomizationDataCount() {
            return this.addCustomizationDataCount;
        }

        public GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo setAddVocabularyDataCount(Integer addVocabularyDataCount) {
            this.addVocabularyDataCount = addVocabularyDataCount;
            return this;
        }
        public Integer getAddVocabularyDataCount() {
            return this.addVocabularyDataCount;
        }

        public GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo setAnnotationInvalid(Integer annotationInvalid) {
            this.annotationInvalid = annotationInvalid;
            return this;
        }
        public Integer getAnnotationInvalid() {
            return this.annotationInvalid;
        }

        public GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo setCharacterCorrectRate(Integer characterCorrectRate) {
            this.characterCorrectRate = characterCorrectRate;
            return this;
        }
        public Integer getCharacterCorrectRate() {
            return this.characterCorrectRate;
        }

        public GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo setCharacterErrorRate(Integer characterErrorRate) {
            this.characterErrorRate = characterErrorRate;
            return this;
        }
        public Integer getCharacterErrorRate() {
            return this.characterErrorRate;
        }

        public GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo setChatTotalCount(Integer chatTotalCount) {
            this.chatTotalCount = chatTotalCount;
            return this;
        }
        public Integer getChatTotalCount() {
            return this.chatTotalCount;
        }

        public GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo setNoAnnotation(Integer noAnnotation) {
            this.noAnnotation = noAnnotation;
            return this;
        }
        public Integer getNoAnnotation() {
            return this.noAnnotation;
        }

        public GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo setSentenceErrorRate(Integer sentenceErrorRate) {
            this.sentenceErrorRate = sentenceErrorRate;
            return this;
        }
        public Integer getSentenceErrorRate() {
            return this.sentenceErrorRate;
        }

        public GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo setWordErrorRate(Integer wordErrorRate) {
            this.wordErrorRate = wordErrorRate;
            return this;
        }
        public Integer getWordErrorRate() {
            return this.wordErrorRate;
        }

    }

    public static class GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnnotationCorrectCount")
        public Integer annotationCorrectCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnnotationInvalid")
        public Integer annotationInvalid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChatTotalCount")
        public Integer chatTotalCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IntentUserSayCount")
        public Integer intentUserSayCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IntentionNotCoveredCount")
        public Integer intentionNotCoveredCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchErrorCount")
        public Integer matchErrorCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NoAnnotation")
        public Integer noAnnotation;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TranslationUnrecognizedCount")
        public Integer translationUnrecognizedCount;

        public static GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo self = new GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo();
            return TeaModel.build(map, self);
        }

        public GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo setAnnotationCorrectCount(Integer annotationCorrectCount) {
            this.annotationCorrectCount = annotationCorrectCount;
            return this;
        }
        public Integer getAnnotationCorrectCount() {
            return this.annotationCorrectCount;
        }

        public GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo setAnnotationInvalid(Integer annotationInvalid) {
            this.annotationInvalid = annotationInvalid;
            return this;
        }
        public Integer getAnnotationInvalid() {
            return this.annotationInvalid;
        }

        public GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo setChatTotalCount(Integer chatTotalCount) {
            this.chatTotalCount = chatTotalCount;
            return this;
        }
        public Integer getChatTotalCount() {
            return this.chatTotalCount;
        }

        public GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo setIntentUserSayCount(Integer intentUserSayCount) {
            this.intentUserSayCount = intentUserSayCount;
            return this;
        }
        public Integer getIntentUserSayCount() {
            return this.intentUserSayCount;
        }

        public GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo setIntentionNotCoveredCount(Integer intentionNotCoveredCount) {
            this.intentionNotCoveredCount = intentionNotCoveredCount;
            return this;
        }
        public Integer getIntentionNotCoveredCount() {
            return this.intentionNotCoveredCount;
        }

        public GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo setMatchErrorCount(Integer matchErrorCount) {
            this.matchErrorCount = matchErrorCount;
            return this;
        }
        public Integer getMatchErrorCount() {
            return this.matchErrorCount;
        }

        public GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo setNoAnnotation(Integer noAnnotation) {
            this.noAnnotation = noAnnotation;
            return this;
        }
        public Integer getNoAnnotation() {
            return this.noAnnotation;
        }

        public GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo setTranslationUnrecognizedCount(Integer translationUnrecognizedCount) {
            this.translationUnrecognizedCount = translationUnrecognizedCount;
            return this;
        }
        public Integer getTranslationUnrecognizedCount() {
            return this.translationUnrecognizedCount;
        }

    }

    public static class GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfoTagSummaryInfoDetailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Name")
        public String name;

        public static GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfoTagSummaryInfoDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfoTagSummaryInfoDetailList self = new GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfoTagSummaryInfoDetailList();
            return TeaModel.build(map, self);
        }

        public GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfoTagSummaryInfoDetailList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfoTagSummaryInfoDetailList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfo extends TeaModel {
        @NameInMap("TagSummaryInfoDetailList")
        public java.util.List<GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfoTagSummaryInfoDetailList> tagSummaryInfoDetailList;

        public static GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfo self = new GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfo();
            return TeaModel.build(map, self);
        }

        public GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfo setTagSummaryInfoDetailList(java.util.List<GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfoTagSummaryInfoDetailList> tagSummaryInfoDetailList) {
            this.tagSummaryInfoDetailList = tagSummaryInfoDetailList;
            return this;
        }
        public java.util.List<GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfoTagSummaryInfoDetailList> getTagSummaryInfoDetailList() {
            return this.tagSummaryInfoDetailList;
        }

    }

    public static class GetAnnotationMissionSummaryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>b3f2c931-5180-43ca-b4aa-2baee2d73c8b</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        @NameInMap("AsrSummaryInfo")
        public GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo asrSummaryInfo;

        @NameInMap("IntentSummaryInfo")
        public GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo intentSummaryInfo;

        /**
         * <strong>example:</strong>
         * <p>You are not authorized to perform this action. CDR:View privileges are required.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TagSummaryInfo")
        public GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfo tagSummaryInfo;

        public static GetAnnotationMissionSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAnnotationMissionSummaryResponseBodyData self = new GetAnnotationMissionSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAnnotationMissionSummaryResponseBodyData setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public GetAnnotationMissionSummaryResponseBodyData setAsrSummaryInfo(GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo asrSummaryInfo) {
            this.asrSummaryInfo = asrSummaryInfo;
            return this;
        }
        public GetAnnotationMissionSummaryResponseBodyDataAsrSummaryInfo getAsrSummaryInfo() {
            return this.asrSummaryInfo;
        }

        public GetAnnotationMissionSummaryResponseBodyData setIntentSummaryInfo(GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo intentSummaryInfo) {
            this.intentSummaryInfo = intentSummaryInfo;
            return this;
        }
        public GetAnnotationMissionSummaryResponseBodyDataIntentSummaryInfo getIntentSummaryInfo() {
            return this.intentSummaryInfo;
        }

        public GetAnnotationMissionSummaryResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAnnotationMissionSummaryResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetAnnotationMissionSummaryResponseBodyData setTagSummaryInfo(GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfo tagSummaryInfo) {
            this.tagSummaryInfo = tagSummaryInfo;
            return this;
        }
        public GetAnnotationMissionSummaryResponseBodyDataTagSummaryInfo getTagSummaryInfo() {
            return this.tagSummaryInfo;
        }

    }

}
