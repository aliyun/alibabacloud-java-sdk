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

    public static class DescribeCharacterSetNameResponseCharacterSetNameItems extends TeaModel {
        @NameInMap("CharacterSetName")
        @Validation(required = true)
        public java.util.List<String> characterSetName;

        public static DescribeCharacterSetNameResponseCharacterSetNameItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCharacterSetNameResponseCharacterSetNameItems self = new DescribeCharacterSetNameResponseCharacterSetNameItems();
            return TeaModel.build(map, self);
        }

    }

}
