// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetDigitalEmployeeUmodelResponseBody extends TeaModel {
    /**
     * <p>The common schemas referenced by the digital employee UModel.</p>
     */
    @NameInMap("commonSchemaRef")
    public java.util.List<GetDigitalEmployeeUmodelResponseBodyCommonSchemaRef> commonSchemaRef;

    /**
     * <p>The description of the digital employee UModel.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the digital employee to which the UModel belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>sample-agent</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-1234567890AB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetDigitalEmployeeUmodelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalEmployeeUmodelResponseBody self = new GetDigitalEmployeeUmodelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDigitalEmployeeUmodelResponseBody setCommonSchemaRef(java.util.List<GetDigitalEmployeeUmodelResponseBodyCommonSchemaRef> commonSchemaRef) {
        this.commonSchemaRef = commonSchemaRef;
        return this;
    }
    public java.util.List<GetDigitalEmployeeUmodelResponseBodyCommonSchemaRef> getCommonSchemaRef() {
        return this.commonSchemaRef;
    }

    public GetDigitalEmployeeUmodelResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDigitalEmployeeUmodelResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDigitalEmployeeUmodelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDigitalEmployeeUmodelResponseBodyCommonSchemaRef extends TeaModel {
        /**
         * <p>The schema group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <p>The schema version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        public static GetDigitalEmployeeUmodelResponseBodyCommonSchemaRef build(java.util.Map<String, ?> map) throws Exception {
            GetDigitalEmployeeUmodelResponseBodyCommonSchemaRef self = new GetDigitalEmployeeUmodelResponseBodyCommonSchemaRef();
            return TeaModel.build(map, self);
        }

        public GetDigitalEmployeeUmodelResponseBodyCommonSchemaRef setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetDigitalEmployeeUmodelResponseBodyCommonSchemaRef setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
