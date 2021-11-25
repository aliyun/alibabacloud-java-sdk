// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotPersonTableRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PersonTable")
    public AddAiotPersonTableRequestPersonTable personTable;

    public static AddAiotPersonTableRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAiotPersonTableRequest self = new AddAiotPersonTableRequest();
        return TeaModel.build(map, self);
    }

    public AddAiotPersonTableRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddAiotPersonTableRequest setPersonTable(AddAiotPersonTableRequestPersonTable personTable) {
        this.personTable = personTable;
        return this;
    }
    public AddAiotPersonTableRequestPersonTable getPersonTable() {
        return this.personTable;
    }

    public static class AddAiotPersonTableRequestPersonTable extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("PersonTableId")
        public String personTableId;

        @NameInMap("Type")
        public Long type;

        @NameInMap("VerificationModelList")
        public java.util.List<Long> verificationModelList;

        public static AddAiotPersonTableRequestPersonTable build(java.util.Map<String, ?> map) throws Exception {
            AddAiotPersonTableRequestPersonTable self = new AddAiotPersonTableRequestPersonTable();
            return TeaModel.build(map, self);
        }

        public AddAiotPersonTableRequestPersonTable setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddAiotPersonTableRequestPersonTable setPersonTableId(String personTableId) {
            this.personTableId = personTableId;
            return this;
        }
        public String getPersonTableId() {
            return this.personTableId;
        }

        public AddAiotPersonTableRequestPersonTable setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public AddAiotPersonTableRequestPersonTable setVerificationModelList(java.util.List<Long> verificationModelList) {
            this.verificationModelList = verificationModelList;
            return this;
        }
        public java.util.List<Long> getVerificationModelList() {
            return this.verificationModelList;
        }

    }

}
