// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCharacterSetResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeCharacterSetResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>709C1E40-092D-4A3D-9958-6D7438******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCharacterSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharacterSetResponseBody self = new DescribeCharacterSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCharacterSetResponseBody setData(DescribeCharacterSetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCharacterSetResponseBodyData getData() {
        return this.data;
    }

    public DescribeCharacterSetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCharacterSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCharacterSetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCharacterSetResponseBodyData extends TeaModel {
        @NameInMap("CharacterSet")
        public java.util.List<String> characterSet;

        /**
         * <strong>example:</strong>
         * <p>polarx</p>
         */
        @NameInMap("Engine")
        public String engine;

        public static DescribeCharacterSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCharacterSetResponseBodyData self = new DescribeCharacterSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCharacterSetResponseBodyData setCharacterSet(java.util.List<String> characterSet) {
            this.characterSet = characterSet;
            return this;
        }
        public java.util.List<String> getCharacterSet() {
            return this.characterSet;
        }

        public DescribeCharacterSetResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

    }

}
