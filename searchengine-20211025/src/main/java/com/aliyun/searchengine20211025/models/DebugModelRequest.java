// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DebugModelRequest extends TeaModel {
    /**
     * <p>The input of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("input")
    public String input;

    /**
     * <p>Specifies whether to perform an online query. Set this parameter to true to use the search configuration. Set this parameter to false to use the build configuration.</p>
     * 
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
