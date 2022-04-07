// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ReplicationProgressRule extends TeaModel {
    // A short description of action
    @NameInMap("Action")
    public String action;

    @NameInMap("Destination")
    public ReplicationDestination destination;

    // A short description of HistoricalObjectReplication
    @NameInMap("HistoricalObjectReplication")
    public String historicalObjectReplication;

    // rule id
    @NameInMap("ID")
    public String ID;

    @NameInMap("PrefixSet")
    public ReplicationPrefixSet prefixSet;

    // A short description of Progress
    @NameInMap("Progress")
    public Progress progress;

    // A short description of action
    @NameInMap("Status")
    public String status;

    public static ReplicationProgressRule build(java.util.Map<String, ?> map) throws Exception {
        ReplicationProgressRule self = new ReplicationProgressRule();
        return TeaModel.build(map, self);
    }

    public ReplicationProgressRule setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ReplicationProgressRule setDestination(ReplicationDestination destination) {
        this.destination = destination;
        return this;
    }
    public ReplicationDestination getDestination() {
        return this.destination;
    }

    public ReplicationProgressRule setHistoricalObjectReplication(String historicalObjectReplication) {
        this.historicalObjectReplication = historicalObjectReplication;
        return this;
    }
    public String getHistoricalObjectReplication() {
        return this.historicalObjectReplication;
    }

    public ReplicationProgressRule setID(String ID) {
        this.ID = ID;
        return this;
    }
    public String getID() {
        return this.ID;
    }

    public ReplicationProgressRule setPrefixSet(ReplicationPrefixSet prefixSet) {
        this.prefixSet = prefixSet;
        return this;
    }
    public ReplicationPrefixSet getPrefixSet() {
        return this.prefixSet;
    }

    public ReplicationProgressRule setProgress(Progress progress) {
        this.progress = progress;
        return this;
    }
    public Progress getProgress() {
        return this.progress;
    }

    public ReplicationProgressRule setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class Progress extends TeaModel {
        // A short description of HistoricalObject
        @NameInMap("HistoricalObject")
        public String historicalObject;

        // A short description of NewObject
        @NameInMap("NewObject")
        public String newObject;

        public static Progress build(java.util.Map<String, ?> map) throws Exception {
            Progress self = new Progress();
            return TeaModel.build(map, self);
        }

        public Progress setHistoricalObject(String historicalObject) {
            this.historicalObject = historicalObject;
            return this;
        }
        public String getHistoricalObject() {
            return this.historicalObject;
        }

        public Progress setNewObject(String newObject) {
            this.newObject = newObject;
            return this;
        }
        public String getNewObject() {
            return this.newObject;
        }

    }

}
