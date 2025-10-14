// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateCustomEndpointResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateCustomEndpointResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2DFF784E-DC31-5BBC-9B25-9261CD9E0AA9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomEndpointResponseBody self = new CreateCustomEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomEndpointResponseBody setData(CreateCustomEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCustomEndpointResponseBodyData getData() {
        return this.data;
    }

    public CreateCustomEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCustomEndpointResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pxe-c4gkgqg****7sgyg</p>
         */
        @NameInMap("CustomEndpointId")
        public String customEndpointId;

        /**
         * <strong>example:</strong>
         * <p>pxc-*********</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        public static CreateCustomEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomEndpointResponseBodyData self = new CreateCustomEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCustomEndpointResponseBodyData setCustomEndpointId(String customEndpointId) {
            this.customEndpointId = customEndpointId;
            return this;
        }
        public String getCustomEndpointId() {
            return this.customEndpointId;
        }

        public CreateCustomEndpointResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

}
