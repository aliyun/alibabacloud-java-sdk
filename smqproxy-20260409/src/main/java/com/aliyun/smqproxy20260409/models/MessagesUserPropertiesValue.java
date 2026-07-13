// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class MessagesUserPropertiesValue extends TeaModel {
    @NameInMap("DataType")
    public String dataType;

    @NameInMap("StringValue")
    public String stringValue;

    @NameInMap("BinaryValue")
    public String binaryValue;

    public static MessagesUserPropertiesValue build(java.util.Map<String, ?> map) throws Exception {
        MessagesUserPropertiesValue self = new MessagesUserPropertiesValue();
        return TeaModel.build(map, self);
    }

    public MessagesUserPropertiesValue setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public MessagesUserPropertiesValue setStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }
    public String getStringValue() {
        return this.stringValue;
    }

    public MessagesUserPropertiesValue setBinaryValue(String binaryValue) {
        this.binaryValue = binaryValue;
        return this;
    }
    public String getBinaryValue() {
        return this.binaryValue;
    }

}
