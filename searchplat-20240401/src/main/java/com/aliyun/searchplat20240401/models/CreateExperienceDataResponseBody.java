// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateExperienceDataResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7ACFD0C5-61E4-5DEA-A995-8279BB99C7E4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public CreateExperienceDataResponseBodyResult result;

    public static CreateExperienceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExperienceDataResponseBody self = new CreateExperienceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExperienceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExperienceDataResponseBody setResult(CreateExperienceDataResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateExperienceDataResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateExperienceDataResponseBodyResult extends TeaModel {
        /**
         * <p>The data content type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1729665694</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <p>The data size.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("dataSize")
        public Long dataSize;

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("dataType")
        public Boolean dataType;

        /**
         * <p>The data content.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("dataValue")
        public String dataValue;

        /**
         * <p>The data ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1222212</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The data name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The service type.</p>
         * 
         * <strong>example:</strong>
         * <p>document-analyze</p>
         */
        @NameInMap("serviceType")
        public String serviceType;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1729665694</p>
         */
        @NameInMap("updated")
        public Long updated;

        public static CreateExperienceDataResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateExperienceDataResponseBodyResult self = new CreateExperienceDataResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateExperienceDataResponseBodyResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateExperienceDataResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public CreateExperienceDataResponseBodyResult setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public CreateExperienceDataResponseBodyResult setDataType(Boolean dataType) {
            this.dataType = dataType;
            return this;
        }
        public Boolean getDataType() {
            return this.dataType;
        }

        public CreateExperienceDataResponseBodyResult setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

        public CreateExperienceDataResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateExperienceDataResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExperienceDataResponseBodyResult setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public CreateExperienceDataResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
