// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateLibraryInstructionRequest extends TeaModel {
    @NameInMap("document")
    public String document;

    @NameInMap("id")
    public Integer id;

    @NameInMap("libraryName")
    public String libraryName;

    @NameInMap("libraryVersion")
    public String libraryVersion;

    public static CreateLibraryInstructionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLibraryInstructionRequest self = new CreateLibraryInstructionRequest();
        return TeaModel.build(map, self);
    }

    public CreateLibraryInstructionRequest setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return this.document;
    }

    public CreateLibraryInstructionRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public CreateLibraryInstructionRequest setLibraryName(String libraryName) {
        this.libraryName = libraryName;
        return this;
    }
    public String getLibraryName() {
        return this.libraryName;
    }

    public CreateLibraryInstructionRequest setLibraryVersion(String libraryVersion) {
        this.libraryVersion = libraryVersion;
        return this;
    }
    public String getLibraryVersion() {
        return this.libraryVersion;
    }

}
