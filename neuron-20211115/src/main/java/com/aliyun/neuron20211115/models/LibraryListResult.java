// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class LibraryListResult extends TeaModel {
    @NameInMap("librarys")
    public java.util.List<Library> librarys;

    @NameInMap("requestId")
    public String requestId;

    public static LibraryListResult build(java.util.Map<String, ?> map) throws Exception {
        LibraryListResult self = new LibraryListResult();
        return TeaModel.build(map, self);
    }

    public LibraryListResult setLibrarys(java.util.List<Library> librarys) {
        this.librarys = librarys;
        return this;
    }
    public java.util.List<Library> getLibrarys() {
        return this.librarys;
    }

    public LibraryListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
