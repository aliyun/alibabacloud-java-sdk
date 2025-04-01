// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DebugModelRequest extends TeaModel {
    @NameInMap("input")
    public String input;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isOnline")
    public String isOnline;

    public static DebugModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugModelRequest self = new DebugModelRequest();
        return TeaModel.build(map, self);
    }

    public DebugModelRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public DebugModelRequest setIsOnline(String isOnline) {
        this.isOnline = isOnline;
        return this;
    }
    public String getIsOnline() {
        return this.isOnline;
    }

}
