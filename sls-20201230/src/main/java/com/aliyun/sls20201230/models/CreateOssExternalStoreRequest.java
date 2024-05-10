// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateOssExternalStoreRequest extends TeaModel {
    /**
     * <p>The name of the external store.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("externalStoreName")
    public String externalStoreName;

    /**
     * <p>The parameters that are configured for the external store.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("parameter")
    public CreateOssExternalStoreRequestParameter parameter;

    /**
     * <p>The type of the external store. Set the value to oss.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("storeType")
    public String storeType;

    public static CreateOssExternalStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOssExternalStoreRequest self = new CreateOssExternalStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateOssExternalStoreRequest setExternalStoreName(String externalStoreName) {
        this.externalStoreName = externalStoreName;
        return this;
    }
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    public CreateOssExternalStoreRequest setParameter(CreateOssExternalStoreRequestParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public CreateOssExternalStoreRequestParameter getParameter() {
        return this.parameter;
    }

    public CreateOssExternalStoreRequest setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public static class CreateOssExternalStoreRequestParameterColumns extends TeaModel {
        /**
         * <p>The name of the field.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of the field.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateOssExternalStoreRequestParameterColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateOssExternalStoreRequestParameterColumns self = new CreateOssExternalStoreRequestParameterColumns();
            return TeaModel.build(map, self);
        }

        public CreateOssExternalStoreRequestParameterColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOssExternalStoreRequestParameterColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateOssExternalStoreRequestParameter extends TeaModel {
        /**
         * <p>The AccessKey ID of your account.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("accessid")
        public String accessid;

        /**
         * <p>The AccessKey secret of your account.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("accesskey")
        public String accesskey;

        /**
         * <p>The name of the OSS bucket.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("bucket")
        public String bucket;

        /**
         * <p>The fields that are associated to the external store.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("columns")
        public java.util.List<CreateOssExternalStoreRequestParameterColumns> columns;

        /**
         * <p>The Object Storage Service (OSS) endpoint.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The names of the OSS objects that are associated to the external store.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("objects")
        public java.util.List<String> objects;

        public static CreateOssExternalStoreRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            CreateOssExternalStoreRequestParameter self = new CreateOssExternalStoreRequestParameter();
            return TeaModel.build(map, self);
        }

        public CreateOssExternalStoreRequestParameter setAccessid(String accessid) {
            this.accessid = accessid;
            return this;
        }
        public String getAccessid() {
            return this.accessid;
        }

        public CreateOssExternalStoreRequestParameter setAccesskey(String accesskey) {
            this.accesskey = accesskey;
            return this;
        }
        public String getAccesskey() {
            return this.accesskey;
        }

        public CreateOssExternalStoreRequestParameter setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public CreateOssExternalStoreRequestParameter setColumns(java.util.List<CreateOssExternalStoreRequestParameterColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<CreateOssExternalStoreRequestParameterColumns> getColumns() {
            return this.columns;
        }

        public CreateOssExternalStoreRequestParameter setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateOssExternalStoreRequestParameter setObjects(java.util.List<String> objects) {
            this.objects = objects;
            return this;
        }
        public java.util.List<String> getObjects() {
            return this.objects;
        }

    }

}
