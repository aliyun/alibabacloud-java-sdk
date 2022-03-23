// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class SayHelloRequest extends TeaModel {
    @NameInMap("word")
    public String word;

    public static SayHelloRequest build(java.util.Map<String, ?> map) throws Exception {
        SayHelloRequest self = new SayHelloRequest();
        return TeaModel.build(map, self);
    }

    public SayHelloRequest setWord(String word) {
        this.word = word;
        return this;
    }
    public String getWord() {
        return this.word;
    }

}
