// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class LibraryInstruction extends TeaModel {
    @NameInMap("document")
    public String document;

    @NameInMap("id")
    public Long id;

    @NameInMap("libraryName")
    public String libraryName;

    @NameInMap("libraryVersion")
    public String libraryVersion;

    public static LibraryInstruction build(java.util.Map<String, ?> map) throws Exception {
        LibraryInstruction self = new LibraryInstruction();
        return TeaModel.build(map, self);
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

    public LibraryInstruction setLibraryName(String libraryName) {
        this.libraryName = libraryName;
        return this;
    }
    public String getLibraryName() {
        return this.libraryName;
    }

    public LibraryInstruction setLibraryVersion(String libraryVersion) {
        this.libraryVersion = libraryVersion;
        return this;
    }
    public String getLibraryVersion() {
        return this.libraryVersion;
    }

}
