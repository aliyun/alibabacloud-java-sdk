// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class TogglePrimaryObjectFavoriteResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The total number of follows by the user for the specified object type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("favoriteCount")
    public Long favoriteCount;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of results.</p>
     */
    @NameInMap("results")
    public java.util.List<TogglePrimaryObjectFavoriteResponseBodyResults> results;

    public static TogglePrimaryObjectFavoriteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TogglePrimaryObjectFavoriteResponseBody self = new TogglePrimaryObjectFavoriteResponseBody();
        return TeaModel.build(map, self);
    }

    public TogglePrimaryObjectFavoriteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TogglePrimaryObjectFavoriteResponseBody setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
        return this;
    }
    public Long getFavoriteCount() {
        return this.favoriteCount;
    }

    public TogglePrimaryObjectFavoriteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TogglePrimaryObjectFavoriteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TogglePrimaryObjectFavoriteResponseBody setResults(java.util.List<TogglePrimaryObjectFavoriteResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<TogglePrimaryObjectFavoriteResponseBodyResults> getResults() {
        return this.results;
    }

    public static class TogglePrimaryObjectFavoriteResponseBodyResults extends TeaModel {
        /**
         * <p>Indicates whether the object is followed after the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isFavorited")
        public Boolean isFavorited;

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The ID of the aligned object: target ID or KR ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>Indicates whether the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("success")
        public Boolean success;

        public static TogglePrimaryObjectFavoriteResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            TogglePrimaryObjectFavoriteResponseBodyResults self = new TogglePrimaryObjectFavoriteResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public TogglePrimaryObjectFavoriteResponseBodyResults setIsFavorited(Boolean isFavorited) {
            this.isFavorited = isFavorited;
            return this;
        }
        public Boolean getIsFavorited() {
            return this.isFavorited;
        }

        public TogglePrimaryObjectFavoriteResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public TogglePrimaryObjectFavoriteResponseBodyResults setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public TogglePrimaryObjectFavoriteResponseBodyResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
