// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCharacterSetNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CharacterSetNameItems")
    public DescribeCharacterSetNameResponseBodyCharacterSetNameItems characterSetNameItems;

    @NameInMap("Engine")
    public String engine;

    public static DescribeCharacterSetNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharacterSetNameResponseBody self = new DescribeCharacterSetNameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCharacterSetNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCharacterSetNameResponseBody setCharacterSetNameItems(DescribeCharacterSetNameResponseBodyCharacterSetNameItems characterSetNameItems) {
        this.characterSetNameItems = characterSetNameItems;
        return this;
    }
    public DescribeCharacterSetNameResponseBodyCharacterSetNameItems getCharacterSetNameItems() {
        return this.characterSetNameItems;
    }

    public DescribeCharacterSetNameResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public static class DescribeCharacterSetNameResponseBodyCharacterSetNameItems extends TeaModel {
        @NameInMap("CharacterSetName")
        public java.util.List<String> characterSetName;

        public static DescribeCharacterSetNameResponseBodyCharacterSetNameItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCharacterSetNameResponseBodyCharacterSetNameItems self = new DescribeCharacterSetNameResponseBodyCharacterSetNameItems();
            return TeaModel.build(map, self);
        }

        public DescribeCharacterSetNameResponseBodyCharacterSetNameItems setCharacterSetName(java.util.List<String> characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }
        public java.util.List<String> getCharacterSetName() {
            return this.characterSetName;
        }

    }

}
