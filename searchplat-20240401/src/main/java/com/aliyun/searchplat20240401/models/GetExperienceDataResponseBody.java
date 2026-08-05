// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetExperienceDataResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5950143C-B8F0-5758-A08A-66F302FD587F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public GetExperienceDataResponseBodyResult result;

    public static GetExperienceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperienceDataResponseBody self = new GetExperienceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperienceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperienceDataResponseBody setResult(GetExperienceDataResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetExperienceDataResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetExperienceDataResponseBodyResult extends TeaModel {
        /**
         * <p>The file type.</p>
         * <ul>
         * <li>pdf</li>
         * <li>text</li>
         * <li>html</li>
         * <li>doc.</li>
         * </ul>
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
         * <p>1745806839720</p>
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
         * <p>The data content.</p>
         * <ul>
         * <li>When dataType is set to file, this field is the OSS address of the file.</li>
         * <li>When dataType is set to url, this field is the HTTP URL of the data.</li>
         * </ul>
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
         * <p>1877</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The data name. This parameter is required when dataType is set to file.</p>
         * 
         * <strong>example:</strong>
         * <p>a.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The service type.</p>
         * <ul>
         * <li>document-analyze.</li>
         * </ul>
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
         * <p>1729684154</p>
         */
        @NameInMap("updated")
        public Long updated;

        public static GetExperienceDataResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetExperienceDataResponseBodyResult self = new GetExperienceDataResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetExperienceDataResponseBodyResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetExperienceDataResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetExperienceDataResponseBodyResult setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public GetExperienceDataResponseBodyResult setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetExperienceDataResponseBodyResult setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

        public GetExperienceDataResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetExperienceDataResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetExperienceDataResponseBodyResult setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetExperienceDataResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
