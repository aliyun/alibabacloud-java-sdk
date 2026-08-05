// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListExperienceDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FDSS_1232</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public java.util.List<ListExperienceDataResponseBodyResult> result;

    public static ListExperienceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperienceDataResponseBody self = new ListExperienceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperienceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperienceDataResponseBody setResult(java.util.List<ListExperienceDataResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListExperienceDataResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListExperienceDataResponseBodyResult extends TeaModel {
        /**
         * <p><strong>The content type.</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p><strong>The creation time.</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12313123123</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <p><strong>The data size.</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("dataSize")
        public Long dataSize;

        /**
         * <p>The data type. Valid values:</p>
         * <ul>
         * <li>file</li>
         * <li>url.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("dataType")
        public String dataType;

        /**
         * <p>The data value.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/xxx.pdf</p>
         */
        @NameInMap("dataValue")
        public String dataValue;

        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>9bd21be8</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.pdf</p>
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
         * <p>1232131231</p>
         */
        @NameInMap("updated")
        public Long updated;

        public static ListExperienceDataResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListExperienceDataResponseBodyResult self = new ListExperienceDataResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListExperienceDataResponseBodyResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListExperienceDataResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListExperienceDataResponseBodyResult setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public ListExperienceDataResponseBodyResult setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListExperienceDataResponseBodyResult setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

        public ListExperienceDataResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListExperienceDataResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExperienceDataResponseBodyResult setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListExperienceDataResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
