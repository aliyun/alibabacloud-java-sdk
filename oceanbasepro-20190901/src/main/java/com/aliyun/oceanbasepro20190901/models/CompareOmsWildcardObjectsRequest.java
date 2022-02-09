// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CompareOmsWildcardObjectsRequest extends TeaModel {
    @NameInMap("Current")
    public String current;

    @NameInMap("Id")
    public String id;

    @NameInMap("Previous")
    public String previous;

    public static CompareOmsWildcardObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareOmsWildcardObjectsRequest self = new CompareOmsWildcardObjectsRequest();
        return TeaModel.build(map, self);
    }

    public CompareOmsWildcardObjectsRequest setCurrent(String current) {
        this.current = current;
        return this;
    }
    public String getCurrent() {
        return this.current;
    }

    public CompareOmsWildcardObjectsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CompareOmsWildcardObjectsRequest setPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    public String getPrevious() {
        return this.previous;
    }

}
