// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetWordGroupResponseBody extends TeaModel {
    /**
     * <p>Status code, 00000 indicates success; others indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Keyword group name.</p>
     * 
     * <strong>example:</strong>
     * <p>testGroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>If there is an error, returns the error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total count.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Keyword group list.</p>
     */
    @NameInMap("WordInfoList")
    public java.util.List<GetWordGroupResponseBodyWordInfoList> wordInfoList;

    public static GetWordGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWordGroupResponseBody self = new GetWordGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWordGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWordGroupResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public GetWordGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWordGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWordGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWordGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetWordGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetWordGroupResponseBody setWordInfoList(java.util.List<GetWordGroupResponseBodyWordInfoList> wordInfoList) {
        this.wordInfoList = wordInfoList;
        return this;
    }
    public java.util.List<GetWordGroupResponseBodyWordInfoList> getWordInfoList() {
        return this.wordInfoList;
    }

    public static class GetWordGroupResponseBodyWordInfoList extends TeaModel {
        /**
         * <p>Label.</p>
         * 
         * <strong>example:</strong>
         * <p>Buss.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>Keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>Inv.</p>
         */
        @NameInMap("Word")
        public String word;

        /**
         * <p>ID of the successfully added word.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WordId")
        public Long wordId;

        public static GetWordGroupResponseBodyWordInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetWordGroupResponseBodyWordInfoList self = new GetWordGroupResponseBodyWordInfoList();
            return TeaModel.build(map, self);
        }

        public GetWordGroupResponseBodyWordInfoList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetWordGroupResponseBodyWordInfoList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

        public GetWordGroupResponseBodyWordInfoList setWordId(Long wordId) {
            this.wordId = wordId;
            return this;
        }
        public Long getWordId() {
            return this.wordId;
        }

    }

}
