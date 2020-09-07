// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCharacterSetNameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("CharacterSetNameItems")
    @Validation(required = true)
    public DescribeCharacterSetNameResponseCharacterSetNameItems characterSetNameItems;

    public static DescribeCharacterSetNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharacterSetNameResponse self = new DescribeCharacterSetNameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCharacterSetNameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCharacterSetNameResponse setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeCharacterSetNameResponse setCharacterSetNameItems(DescribeCharacterSetNameResponseCharacterSetNameItems characterSetNameItems) {
        this.characterSetNameItems = characterSetNameItems;
        return this;
    }
    public DescribeCharacterSetNameResponseCharacterSetNameItems getCharacterSetNameItems() {
        return this.characterSetNameItems;
    }

    public static class DescribeCharacterSetNameResponseCharacterSetNameItems extends TeaModel {
        @NameInMap("CharacterSetName")
        @Validation(required = true)
        public java.util.List<String> characterSetName;

        public static DescribeCharacterSetNameResponseCharacterSetNameItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCharacterSetNameResponseCharacterSetNameItems self = new DescribeCharacterSetNameResponseCharacterSetNameItems();
            return TeaModel.build(map, self);
        }

        public DescribeCharacterSetNameResponseCharacterSetNameItems setCharacterSetName(java.util.List<String> characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }
        public java.util.List<String> getCharacterSetName() {
            return this.characterSetName;
        }

    }

}
