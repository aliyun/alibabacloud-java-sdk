// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class LibraryInstruction extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("document")
    public String document;

    @NameInMap("id")
    public Long id;

    @NameInMap("libraryId")
    public String libraryId;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("requestId")
    public String requestId;

    public static LibraryInstruction build(java.util.Map<String, ?> map) throws Exception {
        LibraryInstruction self = new LibraryInstruction();
        return TeaModel.build(map, self);
    }

    public LibraryInstruction setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public LibraryInstruction setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public LibraryInstruction setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public LibraryInstruction setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public LibraryInstruction setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public LibraryInstruction setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
