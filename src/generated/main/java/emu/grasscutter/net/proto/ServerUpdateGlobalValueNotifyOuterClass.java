// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerUpdateGlobalValueNotify.proto

package emu.grasscutter.net.proto;

public final class ServerUpdateGlobalValueNotifyOuterClass {
  private ServerUpdateGlobalValueNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerUpdateGlobalValueNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServerUpdateGlobalValueNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float delta = 11;</code>
     * @return The delta.
     */
    float getDelta();

    /**
     * <code>.ServerUpdateGlobalValueNotify.UpdateType update_type = 6;</code>
     * @return The enum numeric value on the wire for updateType.
     */
    int getUpdateTypeValue();
    /**
     * <code>.ServerUpdateGlobalValueNotify.UpdateType update_type = 6;</code>
     * @return The updateType.
     */
    emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.UpdateType getUpdateType();

    /**
     * <code>float value = 13;</code>
     * @return The value.
     */
    float getValue();

    /**
     * <code>uint32 entity_id = 15;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 key_hash = 2;</code>
     * @return The keyHash.
     */
    int getKeyHash();
  }
  /**
   * Protobuf type {@code ServerUpdateGlobalValueNotify}
   */
  public static final class ServerUpdateGlobalValueNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ServerUpdateGlobalValueNotify)
      ServerUpdateGlobalValueNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServerUpdateGlobalValueNotify.newBuilder() to construct.
    private ServerUpdateGlobalValueNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerUpdateGlobalValueNotify() {
      updateType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ServerUpdateGlobalValueNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServerUpdateGlobalValueNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 16: {

              keyHash_ = input.readUInt32();
              break;
            }
            case 48: {
              int rawValue = input.readEnum();

              updateType_ = rawValue;
              break;
            }
            case 93: {

              delta_ = input.readFloat();
              break;
            }
            case 109: {

              value_ = input.readFloat();
              break;
            }
            case 120: {

              entityId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.internal_static_ServerUpdateGlobalValueNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.internal_static_ServerUpdateGlobalValueNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.class, emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code ServerUpdateGlobalValueNotify.UpdateType}
     */
    public enum UpdateType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UPDATE_TYPE_INVALUE = 0;</code>
       */
      UPDATE_TYPE_INVALUE(0),
      /**
       * <code>UPDATE_TYPE_ADD = 1;</code>
       */
      UPDATE_TYPE_ADD(1),
      /**
       * <code>UPDATE_TYPE_SET = 2;</code>
       */
      UPDATE_TYPE_SET(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>UPDATE_TYPE_INVALUE = 0;</code>
       */
      public static final int UPDATE_TYPE_INVALUE_VALUE = 0;
      /**
       * <code>UPDATE_TYPE_ADD = 1;</code>
       */
      public static final int UPDATE_TYPE_ADD_VALUE = 1;
      /**
       * <code>UPDATE_TYPE_SET = 2;</code>
       */
      public static final int UPDATE_TYPE_SET_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static UpdateType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static UpdateType forNumber(int value) {
        switch (value) {
          case 0: return UPDATE_TYPE_INVALUE;
          case 1: return UPDATE_TYPE_ADD;
          case 2: return UPDATE_TYPE_SET;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<UpdateType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          UpdateType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<UpdateType>() {
              public UpdateType findValueByNumber(int number) {
                return UpdateType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final UpdateType[] VALUES = values();

      public static UpdateType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private UpdateType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ServerUpdateGlobalValueNotify.UpdateType)
    }

    public static final int DELTA_FIELD_NUMBER = 11;
    private float delta_;
    /**
     * <code>float delta = 11;</code>
     * @return The delta.
     */
    @java.lang.Override
    public float getDelta() {
      return delta_;
    }

    public static final int UPDATE_TYPE_FIELD_NUMBER = 6;
    private int updateType_;
    /**
     * <code>.ServerUpdateGlobalValueNotify.UpdateType update_type = 6;</code>
     * @return The enum numeric value on the wire for updateType.
     */
    @java.lang.Override public int getUpdateTypeValue() {
      return updateType_;
    }
    /**
     * <code>.ServerUpdateGlobalValueNotify.UpdateType update_type = 6;</code>
     * @return The updateType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.UpdateType getUpdateType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.UpdateType result = emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.UpdateType.valueOf(updateType_);
      return result == null ? emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.UpdateType.UNRECOGNIZED : result;
    }

    public static final int VALUE_FIELD_NUMBER = 13;
    private float value_;
    /**
     * <code>float value = 13;</code>
     * @return The value.
     */
    @java.lang.Override
    public float getValue() {
      return value_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 15;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 15;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int KEY_HASH_FIELD_NUMBER = 2;
    private int keyHash_;
    /**
     * <code>uint32 key_hash = 2;</code>
     * @return The keyHash.
     */
    @java.lang.Override
    public int getKeyHash() {
      return keyHash_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (keyHash_ != 0) {
        output.writeUInt32(2, keyHash_);
      }
      if (updateType_ != emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.UpdateType.UPDATE_TYPE_INVALUE.getNumber()) {
        output.writeEnum(6, updateType_);
      }
      if (delta_ != 0F) {
        output.writeFloat(11, delta_);
      }
      if (value_ != 0F) {
        output.writeFloat(13, value_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(15, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (keyHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, keyHash_);
      }
      if (updateType_ != emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.UpdateType.UPDATE_TYPE_INVALUE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, updateType_);
      }
      if (delta_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(11, delta_);
      }
      if (value_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, value_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, entityId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify other = (emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify) obj;

      if (java.lang.Float.floatToIntBits(getDelta())
          != java.lang.Float.floatToIntBits(
              other.getDelta())) return false;
      if (updateType_ != other.updateType_) return false;
      if (java.lang.Float.floatToIntBits(getValue())
          != java.lang.Float.floatToIntBits(
              other.getValue())) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getKeyHash()
          != other.getKeyHash()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DELTA_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getDelta());
      hash = (37 * hash) + UPDATE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + updateType_;
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getValue());
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + KEY_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getKeyHash();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ServerUpdateGlobalValueNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServerUpdateGlobalValueNotify)
        emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.internal_static_ServerUpdateGlobalValueNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.internal_static_ServerUpdateGlobalValueNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.class, emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        delta_ = 0F;

        updateType_ = 0;

        value_ = 0F;

        entityId_ = 0;

        keyHash_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.internal_static_ServerUpdateGlobalValueNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify build() {
        emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify buildPartial() {
        emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify result = new emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify(this);
        result.delta_ = delta_;
        result.updateType_ = updateType_;
        result.value_ = value_;
        result.entityId_ = entityId_;
        result.keyHash_ = keyHash_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify other) {
        if (other == emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.getDefaultInstance()) return this;
        if (other.getDelta() != 0F) {
          setDelta(other.getDelta());
        }
        if (other.updateType_ != 0) {
          setUpdateTypeValue(other.getUpdateTypeValue());
        }
        if (other.getValue() != 0F) {
          setValue(other.getValue());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getKeyHash() != 0) {
          setKeyHash(other.getKeyHash());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float delta_ ;
      /**
       * <code>float delta = 11;</code>
       * @return The delta.
       */
      @java.lang.Override
      public float getDelta() {
        return delta_;
      }
      /**
       * <code>float delta = 11;</code>
       * @param value The delta to set.
       * @return This builder for chaining.
       */
      public Builder setDelta(float value) {
        
        delta_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float delta = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDelta() {
        
        delta_ = 0F;
        onChanged();
        return this;
      }

      private int updateType_ = 0;
      /**
       * <code>.ServerUpdateGlobalValueNotify.UpdateType update_type = 6;</code>
       * @return The enum numeric value on the wire for updateType.
       */
      @java.lang.Override public int getUpdateTypeValue() {
        return updateType_;
      }
      /**
       * <code>.ServerUpdateGlobalValueNotify.UpdateType update_type = 6;</code>
       * @param value The enum numeric value on the wire for updateType to set.
       * @return This builder for chaining.
       */
      public Builder setUpdateTypeValue(int value) {
        
        updateType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ServerUpdateGlobalValueNotify.UpdateType update_type = 6;</code>
       * @return The updateType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.UpdateType getUpdateType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.UpdateType result = emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.UpdateType.valueOf(updateType_);
        return result == null ? emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.UpdateType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ServerUpdateGlobalValueNotify.UpdateType update_type = 6;</code>
       * @param value The updateType to set.
       * @return This builder for chaining.
       */
      public Builder setUpdateType(emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify.UpdateType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        updateType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ServerUpdateGlobalValueNotify.UpdateType update_type = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUpdateType() {
        
        updateType_ = 0;
        onChanged();
        return this;
      }

      private float value_ ;
      /**
       * <code>float value = 13;</code>
       * @return The value.
       */
      @java.lang.Override
      public float getValue() {
        return value_;
      }
      /**
       * <code>float value = 13;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(float value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float value = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = 0F;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 15;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 15;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int keyHash_ ;
      /**
       * <code>uint32 key_hash = 2;</code>
       * @return The keyHash.
       */
      @java.lang.Override
      public int getKeyHash() {
        return keyHash_;
      }
      /**
       * <code>uint32 key_hash = 2;</code>
       * @param value The keyHash to set.
       * @return This builder for chaining.
       */
      public Builder setKeyHash(int value) {
        
        keyHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 key_hash = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearKeyHash() {
        
        keyHash_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ServerUpdateGlobalValueNotify)
    }

    // @@protoc_insertion_point(class_scope:ServerUpdateGlobalValueNotify)
    private static final emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify();
    }

    public static emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerUpdateGlobalValueNotify>
        PARSER = new com.google.protobuf.AbstractParser<ServerUpdateGlobalValueNotify>() {
      @java.lang.Override
      public ServerUpdateGlobalValueNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerUpdateGlobalValueNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServerUpdateGlobalValueNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerUpdateGlobalValueNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ServerUpdateGlobalValueNotifyOuterClass.ServerUpdateGlobalValueNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerUpdateGlobalValueNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerUpdateGlobalValueNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#ServerUpdateGlobalValueNotify.proto\"\363\001" +
      "\n\035ServerUpdateGlobalValueNotify\022\r\n\005delta" +
      "\030\013 \001(\002\022>\n\013update_type\030\006 \001(\0162).ServerUpda" +
      "teGlobalValueNotify.UpdateType\022\r\n\005value\030" +
      "\r \001(\002\022\021\n\tentity_id\030\017 \001(\r\022\020\n\010key_hash\030\002 \001" +
      "(\r\"O\n\nUpdateType\022\027\n\023UPDATE_TYPE_INVALUE\020" +
      "\000\022\023\n\017UPDATE_TYPE_ADD\020\001\022\023\n\017UPDATE_TYPE_SE" +
      "T\020\002B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ServerUpdateGlobalValueNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServerUpdateGlobalValueNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerUpdateGlobalValueNotify_descriptor,
        new java.lang.String[] { "Delta", "UpdateType", "Value", "EntityId", "KeyHash", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
