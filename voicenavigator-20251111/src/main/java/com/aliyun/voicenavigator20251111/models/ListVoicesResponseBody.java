// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListVoicesResponseBody extends TeaModel {
    /**
     * <p>The internal error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A paginated list of voices.</p>
     */
    @NameInMap("Data")
    public ListVoicesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A list of dynamic parameters related to the error.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DB8BA95-4513-54B9-9C67-A28909CFB4AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVoicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoicesResponseBody self = new ListVoicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoicesResponseBody setData(ListVoicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVoicesResponseBodyData getData() {
        return this.data;
    }

    public ListVoicesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVoicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoicesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListVoicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVoicesResponseBodyDataVoices extends TeaModel {
        /**
         * <p>The category of the voice.</p>
         * 
         * <strong>example:</strong>
         * <p>千问音色</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The language supported by the voice.</p>
         * 
         * <strong>example:</strong>
         * <p>中文及中英文混合</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The TTS model.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The name of the voice.</p>
         * 
         * <strong>example:</strong>
         * <p>芊悦</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The TTS engine.</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <p>The style of the voice.</p>
         * 
         * <strong>example:</strong>
         * <p>女声</p>
         */
        @NameInMap("Style")
        public String style;

        /**
         * <p>A list of supported parameters.</p>
         */
        @NameInMap("SupportedParams")
        public java.util.List<String> supportedParams;

        /**
         * <p>The identifier for the voice.</p>
         * 
         * <strong>example:</strong>
         * <p>Cherry</p>
         */
        @NameInMap("Voice")
        public String voice;

        public static ListVoicesResponseBodyDataVoices build(java.util.Map<String, ?> map) throws Exception {
            ListVoicesResponseBodyDataVoices self = new ListVoicesResponseBodyDataVoices();
            return TeaModel.build(map, self);
        }

        public ListVoicesResponseBodyDataVoices setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListVoicesResponseBodyDataVoices setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListVoicesResponseBodyDataVoices setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListVoicesResponseBodyDataVoices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVoicesResponseBodyDataVoices setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public ListVoicesResponseBodyDataVoices setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

        public ListVoicesResponseBodyDataVoices setSupportedParams(java.util.List<String> supportedParams) {
            this.supportedParams = supportedParams;
            return this;
        }
        public java.util.List<String> getSupportedParams() {
            return this.supportedParams;
        }

        public ListVoicesResponseBodyDataVoices setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

    }

    public static class ListVoicesResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total count of voices.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>A list of voices.</p>
         */
        @NameInMap("Voices")
        public java.util.List<ListVoicesResponseBodyDataVoices> voices;

        public static ListVoicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVoicesResponseBodyData self = new ListVoicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVoicesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListVoicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVoicesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListVoicesResponseBodyData setVoices(java.util.List<ListVoicesResponseBodyDataVoices> voices) {
            this.voices = voices;
            return this;
        }
        public java.util.List<ListVoicesResponseBodyDataVoices> getVoices() {
            return this.voices;
        }

    }

}
