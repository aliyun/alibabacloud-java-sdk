// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetAsrVocabResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAsrVocabResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAsrVocabResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsrVocabResponseBody self = new GetAsrVocabResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsrVocabResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAsrVocabResponseBody setData(GetAsrVocabResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsrVocabResponseBodyData getData() {
        return this.data;
    }

    public GetAsrVocabResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAsrVocabResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsrVocabResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAsrVocabResponseBodyDataWordsWord extends TeaModel {
        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Word")
        public String word;

        public static GetAsrVocabResponseBodyDataWordsWord build(java.util.Map<String, ?> map) throws Exception {
            GetAsrVocabResponseBodyDataWordsWord self = new GetAsrVocabResponseBodyDataWordsWord();
            return TeaModel.build(map, self);
        }

        public GetAsrVocabResponseBodyDataWordsWord setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public GetAsrVocabResponseBodyDataWordsWord setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class GetAsrVocabResponseBodyDataWords extends TeaModel {
        @NameInMap("Word")
        public java.util.List<GetAsrVocabResponseBodyDataWordsWord> word;

        public static GetAsrVocabResponseBodyDataWords build(java.util.Map<String, ?> map) throws Exception {
            GetAsrVocabResponseBodyDataWords self = new GetAsrVocabResponseBodyDataWords();
            return TeaModel.build(map, self);
        }

        public GetAsrVocabResponseBodyDataWords setWord(java.util.List<GetAsrVocabResponseBodyDataWordsWord> word) {
            this.word = word;
            return this;
        }
        public java.util.List<GetAsrVocabResponseBodyDataWordsWord> getWord() {
            return this.word;
        }

    }

    public static class GetAsrVocabResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Words")
        public GetAsrVocabResponseBodyDataWords words;

        public static GetAsrVocabResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsrVocabResponseBodyData self = new GetAsrVocabResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsrVocabResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAsrVocabResponseBodyData setWords(GetAsrVocabResponseBodyDataWords words) {
            this.words = words;
            return this;
        }
        public GetAsrVocabResponseBodyDataWords getWords() {
            return this.words;
        }

    }

}
